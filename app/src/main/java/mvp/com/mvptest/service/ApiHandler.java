package mvp.com.mvptest.service;

import android.content.Context;
import android.util.Log;


import com.squareup.otto.Subscribe;

import mvp.com.mvptest.event.ApiBus;
import mvp.com.mvptest.event.ImagesReceivedEvent;
import mvp.com.mvptest.event.ImagesRequestedEvent;
import mvp.com.mvptest.model.post;
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



    @Subscribe public void onGetConversationGroup(final ImagesRequestedEvent event) {

        api.getImage(new Callback<post>() {
            @Override
            public void success(post post, Response response) {
            Log.e("Response", post.getPosts().size() + "");
                if(post != null){
                    for(int i = 0; i < post.getPosts().size();i++){
                        ApiBus.getInstance().postQueue(new ImagesReceivedEvent(post));
                    }

                }

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

}
