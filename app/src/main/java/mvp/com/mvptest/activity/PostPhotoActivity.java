package mvp.com.mvptest.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;


import com.squareup.otto.Subscribe;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mvp.com.mvptest.MainActivity;
import mvp.com.mvptest.PathManager;
import mvp.com.mvptest.PostUploadService;
import mvp.com.mvptest.R;
import mvp.com.mvptest.event.ApiBus;
import mvp.com.mvptest.model.UploadPostCallback;
import mvp.com.mvptest.wiget.Utils;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedFile;

public class PostPhotoActivity extends Activity implements OnClickListener {

    Context context;

    Button post_photo, button2, button3;
    ImageView imageView;
    EditText et_box;

    File tempFile;
    int TAKE_PICTURE = 001;
    int ACTIVITY_SELECT_IMAGE = 002;
    public static final String ARG_TAKEN_PHOTO_URI = "arg_taken_photo_uri";
     Uri photoUri;
    private int photoSize;

    @Override
    public void onBackPressed() {

        //ViewCompat.setElevation(getToolbar(), 0);
        finishPosting();
    }

    private void finishPosting() {
        contentRoot.animate()
                .translationY(Utils.getScreenHeight(this))
                .setDuration(200)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        PostPhotoActivity.super.onBackPressed();
                        overridePendingTransition(0, 0);
                    }
                })
                .start();
    }


    public static void openWithPhotoUri(Activity openingActivity, Uri photoUri) {
        Intent intent = new Intent(openingActivity, PostPhotoActivity.class);
        intent.putExtra(ARG_TAKEN_PHOTO_URI, photoUri);
        openingActivity.startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(ARG_TAKEN_PHOTO_URI, photoUri);
    }


    public LinearLayout contentRoot;


    @Override
    protected void onResume() {
        super.onResume();
        ApiBus.getInstance().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ApiBus.getInstance().unregister(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_photo);
        final View rootView = findViewById(R.id.root_view);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        et_box = (EditText) findViewById(R.id.et_box);
        contentRoot = (LinearLayout) findViewById(R.id.contentRoot);

        context = this;

        prepareDialog();
        //  setupToolbar();
        //String path = getIntent().getExtras().getString("photo");
        //String rotate = getIntent().getExtras().getString("rotate");

//        if (savedInstanceState == null) {
//            photoUri = getIntent().getParcelableExtra(ARG_TAKEN_PHOTO_URI);
//
//        } else {
//            photoUri = savedInstanceState.getParcelable(ARG_TAKEN_PHOTO_URI);
//
//        }


        context = this;

        post_photo = (Button) findViewById(R.id.button_recent);

        imageView = (ImageView) findViewById(R.id.image);

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(
                        android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, TAKE_PICTURE);
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, ACTIVITY_SELECT_IMAGE);
            }
        });
        post_photo.setOnClickListener(this);

    }

    public void onActivityResult(int requestcode, int resultcode, Intent intent) {
        super.onActivityResult(requestcode, resultcode, intent);
        if (resultcode == RESULT_OK) {
            if (requestcode == TAKE_PICTURE) {
                photoUri = intent.getData();
//                tempFile = new File(PathManager.getPath(context, photoUri));
                Log.e("dddddd", photoUri + "");
                imageView.setImageURI(photoUri);
            } else if (requestcode == ACTIVITY_SELECT_IMAGE) {
                photoUri = intent.getData();
                Log.e("ssssss",photoUri+"");
              //  tempFile = new File(PathManager.getPath(context, photoUri));
                String[] filePath = {MediaStore.Images.Media.DATA};
                Cursor c = getContentResolver().query(photoUri, filePath,
                        null, null, null);
                c.moveToFirst();
                int columnIndex = c.getColumnIndex(filePath[0]);
                String picturePath = c.getString(columnIndex);
                c.close();
                Bitmap thumbnail = (BitmapFactory.decodeFile(picturePath));
                Drawable drawable = new BitmapDrawable(thumbnail);
                imageView.setImageBitmap(thumbnail);

            }
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent upIntent = new Intent(this, MainActivity.class);
                if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
                    TaskStackBuilder.from(this).addNextIntent(upIntent)
                            .startActivities();
                    finish();
                } else {
                    NavUtils.navigateUpTo(this, upIntent);
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public ProgressDialog dialog;
    public String statusText;

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_recent) {
            statusText = et_box.getText().toString()
                    .replace("\n", "%0A");

            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(statusText);
            boolean found = matcher.find();
            boolean isWhitespace = statusText.matches("^\\s*$");

            if (statusText.length() == 0 || statusText.trim().equals("") || found || isWhitespace) {
                Log.e("YEAH", statusText.length() + " " + statusText.trim() + " " + found + " " + isWhitespace);
            }

            statusText = et_box.getText().toString();

            String fromUserId = "153";
            uploadPost(statusText, fromUserId, "");

            //new UploadFileToServer().execute();

        }

    }

    void prepareDialog() {
        dialog = new ProgressDialog(context);
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        dialog.setInverseBackgroundForced(false);
        dialog.setCanceledOnTouchOutside(false);
        //dialog.setTitle(getString(R.string.uploading));
        //dialog.setMessage(getString(R.string.waiting));
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setIndeterminate(false);
        dialog.setMax(100);
    }

    private void uploadPost(String text, String fromUserId, String toUserId) {
        //String url = "http://chat.vdomax.com/upload";

        // TypedFile typedFile = new TypedFile("multipart/form-data", tempFile);

        uploadPostRetrofit(tempFile, text, fromUserId, toUserId);

    }


    PostUploadService buildUploadApi() {
        String BASE_URL = "https://www.vdomax.com";

        return new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_URL)

                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        //request.addQueryParam("p1", "var1");
                        //request.addQueryParam("p2", "");
                    }
                })
                .build()
                .create(PostUploadService.class);
    }

    private void uploadPostRetrofit(File file, String text, String fromUserId, String toUserId) {
        //FileUploadService service = ServiceGenerator.createService(FileUpload.class, FileUpload.BASE_URL);

        PostUploadService service = buildUploadApi();
        TypedFile typedFile = new TypedFile("multipart/form-data", file);

        service.uploadPostPhoto(text, fromUserId, toUserId, typedFile, new retrofit.Callback<UploadPostCallback>() {
            @Override
            public void success(UploadPostCallback uploadCallback, Response response) {
                if (uploadCallback.status == 200)
                    Utils.showToast("Post photo success");
                else
                    Utils.showToast("Post photo failed");

                Intent i = new Intent(PostPhotoActivity.this, MainActivity.class);
                startActivity(i);
                finish();

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }


}