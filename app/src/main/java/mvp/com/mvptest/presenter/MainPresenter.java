/*
 *
 *  * Copyright (C) 2014 Antonio Leiva Gordillo.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package mvp.com.mvptest.presenter;


import com.squareup.otto.Subscribe;

import mvp.com.mvptest.event.ActivityResultBus;
import mvp.com.mvptest.event.ApiBus;
import mvp.com.mvptest.event.LoadTimelineEvent;
import mvp.com.mvptest.event.LoadTimelineSuccessEvent;

public class MainPresenter implements Presenter<FeedView> {
    FeedView feedView;
    private static String TYPE = "";
    private static int PER_PAGE = 20;

    @Override
    public void attachView(FeedView view) {
        this.feedView = view;

    }

    @Override
    public void detachView() {
        this.feedView = null;
    }

    @Override
    public void onResume() {
        ApiBus.getInstance().register(this);
        ActivityResultBus.getInstance().register(this);
        ApiBus.getInstance().post(new LoadTimelineEvent(Integer.parseInt("2"), TYPE, 1, PER_PAGE, false));
    }


    @Override
    public void onPause() {
        ApiBus.getInstance().unregister(this);
        ActivityResultBus.getInstance().unregister(this);
    }

//    @Subscribe
//    public void getImage(ImagesReceivedEvent event) {
//        Log.e("Test", event.getPost().getPosts().size() + "");
//        Log.e("OK", event.getPost().getPosts().size() + "");
//        if (event.getPost() != null) {
//            feedView.setPosts(event.getPost());
//
//        }
//
//    }

    @Subscribe
    public void onGetStoryEventSuccess(LoadTimelineSuccessEvent event) {
        feedView.setPosts(event.getTimelineData().getPosts());
    }


}
