package com.drunkpiano.mvpsample.ShowSlogan;


import com.drunkpiano.mvpsample.BasePresenter;
import com.drunkpiano.mvpsample.BaseView;

/**
 * Contract that containing view and presenter interface.
 * Created by DrunkPiano on 2016/12/13.
 */

public interface SloganContract {
    interface View extends BaseView<Presenter> {

        void setSlogan(String slogan);
    }

    interface Presenter extends BasePresenter {

    }
}
