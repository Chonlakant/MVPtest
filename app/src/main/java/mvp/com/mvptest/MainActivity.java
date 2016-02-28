package mvp.com.mvptest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import mvp.com.mvptest.activity.MainFeedListAndGridFragment;
import mvp.com.mvptest.adapter.RecyclerViewTimelineListAdapter;
import mvp.com.mvptest.model.PostStory;
import mvp.com.mvptest.presenter.FeedView;
import mvp.com.mvptest.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

}
