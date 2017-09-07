package com.simple_jie.daggerandroid.placeholder;

import com.simple_jie.daggerandroid.domain.FakeTask;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Xingbo.Jie on 7/9/17.
 */

public class ParameterPresenter implements PlaceHolderContract.Presenter {
    PlaceHolderContract.View view;
    String uid;
    FakeTask task;


    @Inject
    public ParameterPresenter(PlaceHolderContract.View view, @Named("UID") String uid, FakeTask task) {
        this.view = view;
        this.uid = uid;
        this.task = task;
    }

    @Override
    public void start() {

    }
}
