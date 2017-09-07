package com.simple_jie.daggerandroid.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Xingbo.Jie on 7/9/17.
 */

@Module
public class ActivityModule {
    @Provides
    Activity provideActivity(DaggerAppCompatActivity appCompatActivity) {
        return appCompatActivity;
    }
}
