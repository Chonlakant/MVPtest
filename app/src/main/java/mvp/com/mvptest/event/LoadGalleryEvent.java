package mvp.com.mvptest.event;


import mvp.com.mvptest.model.VMFeed;

/**
 * Created by Mac on 6/8/15.
 */
public class LoadGalleryEvent {
    public VMFeed feed;
    public String sort;
    public LoadGalleryEvent(VMFeed feed, String sort) {
        this.feed = feed;
        this.sort = sort;
    }
}
