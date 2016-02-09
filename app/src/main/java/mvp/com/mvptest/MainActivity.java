package mvp.com.mvptest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import mvp.com.mvptest.adapter.CustomAdapter;
import mvp.com.mvptest.model.Post;
import mvp.com.mvptest.model.PostStory;
import mvp.com.mvptest.presenter.MainPresenter;
import mvp.com.mvptest.presenter.PhotosView;

public class MainActivity extends AppCompatActivity implements PhotosView {
    private MainPresenter mMainPresenter;
    ImageView imageView;
    ListView listView;
    CustomAdapter customAdapter;
    //ArrayList<post> listPost = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        listView = (ListView) findViewById(R.id.listView);
        mMainPresenter = new MainPresenter();
        mMainPresenter.attachView(this);
        mMainPresenter.onResume();
    }
    @Override
    public Context getContext() {
        return null;
    }


    @Override
    public void setPhotos(PostStory images) {
        Log.e("Test", images.getAgoText()+ "");
    }
}
