package mvp.com.mvptest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;

import mvp.com.mvptest.adapter.RecyclerViewTimelineListAdapter;
import mvp.com.mvptest.model.PostStory;
import mvp.com.mvptest.presenter.FeedView;
import mvp.com.mvptest.presenter.MainPresenter;

public class FeedListFragment extends BaseFragment implements FeedView {
    private MainPresenter mMainPresenter;
    ImageView imageView;
    ArrayList<PostStory> list = new ArrayList<PostStory>();
    public RecyclerView mRecyclerView;
    RecyclerViewTimelineListAdapter recyclerViewTimelineListAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        imageView = (ImageView) rootView.findViewById(R.id.imageView);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rvFeed);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mMainPresenter = new MainPresenter();
        mMainPresenter.attachView(this);
        mMainPresenter.onResume();
        return rootView;
    }

    @Override
    public Context getContext() {
        return null;
    }


    @Override
    public void setPosts(List<PostStory> posts) {
        list.addAll(posts);
        recyclerViewTimelineListAdapter = new RecyclerViewTimelineListAdapter(getActivity(), list);
        mRecyclerView.setAdapter(recyclerViewTimelineListAdapter);
    }


}