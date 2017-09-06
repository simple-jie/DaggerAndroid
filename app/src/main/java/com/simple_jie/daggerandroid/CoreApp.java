package com.simple_jie.daggerandroid;

import android.util.Log;

import com.simple_jie.daggerandroid.di.DaggerCoreAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.DaggerApplication;

/**
 * Created by Xingbo.Jie on 5/9/17.
 */

public class CoreApp extends DaggerApplication implements HasActivityInjector {
    private static final String TAG = CoreApp.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<CoreApp> applicationInjector() {
        return DaggerCoreAppComponent.builder().create(this);
    }

    @Inject
    void logInjection() {
        Log.i(TAG, "Injecting " + CoreApp.class.getSimpleName());
    }
}
