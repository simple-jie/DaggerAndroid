package com.simple_jie.daggerandroid.placeholder;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Xingbo.Jie on 7/9/17.
 */

public class ParameterPresenter implements PlaceHolderContract.Presenter {
    PlaceHolderContract.View view;
    String uid;


    @Inject
    public ParameterPresenter(PlaceHolderContract.View view, @Named("UID") String uid) {
        this.view = view;
        this.uid = uid;
    }

    @Override
    public void start() {

    }
}
