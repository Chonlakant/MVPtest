package mvp.com.mvptest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import mvp.com.mvptest.adapter.CustomAdapter;
import mvp.com.mvptest.adapter.RecyclerViewTimelineListAdapter;
import mvp.com.mvptest.model.Post;
import mvp.com.mvptest.model.PostStory;
import mvp.com.mvptest.presenter.MainPresenter;
import mvp.com.mvptest.presenter.PhotosView;

public class MainActivity extends AppCompatActivity implements PhotosView {
    private MainPresenter mMainPresenter;
    ImageView imageView;
    ListView listView;
    ArrayList<PostStory> list;
    public RecyclerView mRecyclerView;
    CustomAdapter customAdapter;
    RecyclerViewTimelineListAdapter recyclerViewTimelineListAdapter;

    //ArrayList<post> listPost = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        mRecyclerView = (RecyclerView) findViewById(R.id.rvFeed);
        mRecyclerView.setHasFixedSize(true);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(linearLayoutManager);
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
        list.add(images);
        for (int i = 0; i < images.; i++) {
//            if (list.get(i).type.equals("photo")) {
//                Log.e("qqqqqq", list.get(i).type);
//                Log.e("qqqqqq", list.get(i).media.getFullUrl());
//                recyclerViewTimelineListAdapter = new RecyclerViewTimelineListAdapter(getApplicationContext(), list);
//            }if (list.get(i).type.equals("text")) {
//                Log.e("text", list.get(i).type);
//                recyclerViewTimelineListAdapter = new RecyclerViewTimelineListAdapter(getApplicationContext(), list);
//            }
            recyclerViewTimelineListAdapter = new RecyclerViewTimelineListAdapter(getApplicationContext(), list);
            mRecyclerView.setAdapter(recyclerViewTimelineListAdapter);
        }

    }
}
