package mvp.com.mvptest.service;

import java.util.Map;

import mvp.com.mvptest.event.TimelineDataResponse;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;


public interface ApiService {

    @GET("/posts/user_timeline/{id}?page=1&type=&per_page=20")
    public void getUserTimeline(@Path("id") int id,@QueryMap Map<String, String> options,
                                Callback<TimelineDataResponse> responseJson);

}
