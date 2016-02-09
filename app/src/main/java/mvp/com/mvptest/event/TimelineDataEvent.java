package mvp.com.mvptest.event;


import mvp.com.mvptest.model.PostStory;

/**
 * Created by Mac on 3/12/15.
 */
public class TimelineDataEvent {
    private PostStory post;

    public TimelineDataEvent(PostStory post) {
        this.post = post;
    }

    public PostStory getPost() {
        return post;
    }
}
