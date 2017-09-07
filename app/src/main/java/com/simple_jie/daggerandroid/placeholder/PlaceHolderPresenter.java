package com.simple_jie.daggerandroid.placeholder;

import android.app.Activity;

import com.simple_jie.daggerandroid.R;
import com.simple_jie.daggerandroid.domain.FakeTask;
import com.simple_jie.daggerandroid.domain.SingletonFakeTask;

import javax.inject.Inject;

/**
 * Created by Xingbo.Jie on 7/9/17.
 */

public class PlaceHolderPresenter implements PlaceHolderContract.Presenter {
    Activity activity;

    FakeTask task;
    SingletonFakeTask singletonFakeTask;
    PlaceHolderContract.View view;
    String model;

    public PlaceHolderPresenter(Activity activity, FakeTask task, SingletonFakeTask singletonFakeTask, PlaceHolderContract.View view, String model) {
        this.activity = activity;
        this.task = task;
        this.singletonFakeTask = singletonFakeTask;
        this.view = view;
        this.model = model;
    }

    @Override
    public void start() {
        StringBuilder builder = new StringBuilder();
        builder.append(model);
        builder.append('\n');
        builder.append("Fake task " + task.hashCode());
        builder.append('\n');
        builder.append("Inject singletonFakeTask = " + (singletonFakeTask == null ? "null" : singletonFakeTask.hashCode()));
        builder.toString();
        view.renderText(builder.toString());
    }
}
