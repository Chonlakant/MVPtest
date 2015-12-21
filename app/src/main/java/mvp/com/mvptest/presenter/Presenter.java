package mvp.com.mvptest.presenter;


import com.squareup.otto.Subscribe;

import mvp.com.mvptest.event.ImagesReceivedEvent;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

    public void onResume();

    public void onPause();


}