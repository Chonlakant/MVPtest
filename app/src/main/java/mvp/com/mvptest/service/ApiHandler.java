package mvp.com.mvptest.service;

import android.content.Context;
import android.util.Log;


import com.squareup.otto.Subscribe;

import java.util.HashMap;
import java.util.Map;

import mvp.com.mvptest.event.ApiBus;
import mvp.com.mvptest.event.LoadTimelineEvent;
import mvp.com.mvptest.event.LoadTimelineSuccessEvent;
import mvp.com.mvptest.event.TimelineDataResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class ApiHandler {

    public Context context;
    private ApiService api;
    private ApiBus apiBus;

    public ApiHandler(Context context, ApiService api,
                      ApiBus apiBus) {

        this.context = context;
        this.api = api;
        this.apiBus = apiBus;
    }

    public void registerForEvents() {
        apiBus.register(this);
    }



    @Subscribe
    public void onHomeTimelineRequestEvent(LoadTimelineEvent event) {
        Map<String, String> options = new HashMap<String, String>();

        options.put("type", event.getType());
        options.put("page", Integer.toString(event.getPage()));
        options.put("per_page", Integer.toString(event.getPerPage()));
        Log.e("event", event.getUserId() + "");

        api.getUserTimeline(event.getUserId(), options, new Callback<TimelineDataResponse>() {
            @Override
            public void success(TimelineDataResponse timelineDataResponse, Response response) {
                // Log.e("posts", timelineDataResponse.getPosts().toArray().toString());สกเ่กสสาเ่ร่ส่วาสสยสเา่แ่นรเว่้วา้รนร
                if (timelineDataResponse.getStatus().equals("1")) {
                    Log.e("timelineDataResponse", response.getBody().toString());
                    Log.e("timelineDataResponse", timelineDataResponse.getUser().avatar);

                        ApiBus.getInstance().post(new LoadTimelineSuccessEvent(timelineDataResponse));
                } else {
                    //MainApplication.get(this).getPrefManager().isLogin().put(false);
                    Log.e("LOGOUT!", "LOG OUT LAEW");
                    //ApiBus.getInstance().post(new LogoutEvent());
                }

            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("error", error.toString());
                Log.e("error", error.getLocalizedMessage());
                Log.e("error", error.getUrl());
            }
        });
    }

}
