package mvp.com.mvptest.service;

import mvp.com.mvptest.model.post;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


public interface ApiService {

    @GET("/api/get_recent_summary")
    void getImage(Callback<post> callback);

}
