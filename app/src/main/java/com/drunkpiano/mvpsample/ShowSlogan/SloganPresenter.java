package com.drunkpiano.mvpsample.ShowSlogan;

import android.support.annotation.NonNull;

/**
 * The presenter. Bridge connecting views and models.
 * <p>
 * Created by DrunkPiano on 2016/12/13.
 */

public class SloganPresenter implements SloganContract.Presenter {

    private final SloganModel mSloganModel;
    private final SloganContract.View mSloganView;

    //通过构造函数把Model和View传进来
    public SloganPresenter(@NonNull SloganModel sloganModel, @NonNull SloganContract.View sloganView) {
        mSloganModel = sloganModel;
        mSloganView = sloganView;
        //把Presenter传给view，这样View中可以调用Presenter的方法来更新Model、更新View。
        mSloganView.setPresenter(this);
    }

    @Override
    public void updateCount(int count) {
        changeSlogan(count);
    }

    private void changeSlogan(int count) {
        //在Presenter中更新Model
        mSloganModel.sloganContent = "We have -------> " + count + " slogan(s) now!";
        //在Presenter中更新View
        mSloganView.setSlogan(mSloganModel.sloganContent);
    }
}
