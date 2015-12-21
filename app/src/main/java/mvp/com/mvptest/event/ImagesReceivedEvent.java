package mvp.com.mvptest.event;

import android.util.Log;

import java.util.ArrayList;

import mvp.com.mvptest.model.post;


/**
 * Created by marcus on 22/04/15
 */

public class ImagesReceivedEvent {

    private static final String TAG = ImagesReceivedEvent.class.getSimpleName();
    private post post;

    public ImagesReceivedEvent(post post){
        this.post = post;
    }

    public mvp.com.mvptest.model.post getPost() {
        return post;
    }
}