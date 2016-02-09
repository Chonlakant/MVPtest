package mvp.com.mvptest.event;

public class GetStoryEvent {
    private String postId;

    public GetStoryEvent(String postId) {
        this.postId = postId;
    }

    public String getPostId() {
        return postId;
    }
}
