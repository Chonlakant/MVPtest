package mvp.com.mvptest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import mvp.com.mvptest.adapter.RecyclerViewTimelineListAdapter;
import mvp.com.mvptest.model.PostStory;
import mvp.com.mvptest.presenter.FeedView;
import mvp.com.mvptest.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements FeedView {
    private MainPresenter mMainPresenter;
    ImageView imageView;
    ArrayList<PostStory> list = new ArrayList<PostStory>();
    public RecyclerView mRecyclerView;
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
    public void setPosts(List<PostStory> posts) {
        list.addAll(posts);
        recyclerViewTimelineListAdapter = new RecyclerViewTimelineListAdapter(getApplicationContext(), list);
        mRecyclerView.setAdapter(recyclerViewTimelineListAdapter);
    }
}
