package mvp.com.mvptest.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import mvp.com.mvptest.R;
import mvp.com.mvptest.adapter.RecyclerViewTimelineListAdapter;
import mvp.com.mvptest.model.PostStory;
import mvp.com.mvptest.presenter.FeedView;
import mvp.com.mvptest.presenter.MainPresenter;

public class ActivityWrite extends AppCompatActivity {

    //ArrayList<post> listPost = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_on_event);

    }




}
