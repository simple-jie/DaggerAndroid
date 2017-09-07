package com.simple_jie.daggerandroid.di.module;

import android.content.Context;

import com.simple_jie.daggerandroid.CoreApp;
import com.simple_jie.daggerandroid.di.Application;
import com.simple_jie.daggerandroid.domain.FakeTask;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Singleton
@Module
public class CoreApplicationModule {

    @Application
    @Provides
    Context provideContext(CoreApp application) {
        return application.getApplicationContext();
    }

    @Provides
//    @Singleton
    FakeTask provideFakeTask() {
        return new FakeTask();
    }
}
