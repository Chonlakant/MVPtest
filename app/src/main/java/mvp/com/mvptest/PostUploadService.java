package mvp.com.mvptest;


import java.util.Map;

import mvp.com.mvptest.model.UploadAvatarCallback;
import mvp.com.mvptest.model.UploadCoverCallback;
import mvp.com.mvptest.model.UploadPostCallback;
import retrofit.Callback;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.http.QueryMap;
import retrofit.mime.TypedFile;

public interface PostUploadService {

    @Multipart
    @POST("/ajax.php?t=post&a=new&user_id=6&token=123456&user_pass=039a726ac0aeec3dde33e45387a7d4ac")
    void uploadPostPhoto(
            @Part("text") String text,
            @Part("timeline_id") String timelineId,
            @Part("recipient_id") String recipientId,
            @Part("photos[]") TypedFile file,
            Callback<UploadPostCallback> cb);

    @Multipart
    @POST("/ajax.php?t=post&a=new&user_id=6&token=123456&user_pass=039a726ac0aeec3dde33e45387a7d4ac")
    void uploadPostClip(
            @Part("text") String text,
            @Part("timeline_id") String timelineId,
            @Part("recipient_id") String recipientId,
            @Part("clips[]") TypedFile file,
            Callback<UploadPostCallback> cb);

    @Multipart
    //ajax.php?mobile=1&t=avatar&a=new&user_id="+ +"&token=123456&user_pass="+VMApp.mPref.password().getOr("");
    @POST("/ajax.php")
    void uploadAvatar(
            @Part("timeline_id") String timelineId,
            @Part("image") TypedFile file,
            @QueryMap Map<String, String> options,
            Callback<UploadAvatarCallback> cb);

    @Multipart
    //ajax.php?mobile=1&t=avatar&a=new&user_id="+ +"&token=123456&user_pass="+VMApp.mPref.password().getOr("");
    @POST("/ajax.php")
    void uploadCover(
            @Part("timeline_id") String timelineId,
            @Part("image") TypedFile file,
            @QueryMap Map<String, String> options,
            Callback<UploadCoverCallback> cb);

}
