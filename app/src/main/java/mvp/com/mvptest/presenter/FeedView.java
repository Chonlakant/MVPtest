package mvp.com.mvptest.presenter;

import java.util.List;

import mvp.com.mvptest.BaseContextView;
import mvp.com.mvptest.model.PostStory;


/**
 * Created by marcus on 6/8/2015
 */

public interface FeedView extends BaseContextView {
    void setPosts(List<PostStory> posts);
}
