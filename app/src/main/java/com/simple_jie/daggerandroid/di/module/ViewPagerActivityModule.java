package com.simple_jie.daggerandroid.di.module;

import android.app.Activity;

import com.simple_jie.daggerandroid.ViewPagerActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Xingbo.Jie on 7/9/17.
 */

@Module
public class ViewPagerActivityModule {
    @Provides
    Activity provideActivity(ViewPagerActivity activity) {
        return activity;
    }
}
