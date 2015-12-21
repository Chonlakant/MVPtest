package mvp.com.mvptest.presenter;

import java.util.ArrayList;

import mvp.com.mvptest.BaseContextView;
import mvp.com.mvptest.model.post;


/**
 * Created by marcus on 6/8/2015
 */

public interface PhotosView extends BaseContextView {
    void setPhotos(post images);
}
