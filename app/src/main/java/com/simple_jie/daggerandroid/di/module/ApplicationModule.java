package com.simple_jie.daggerandroid.di.module;

import com.simple_jie.daggerandroid.domain.FakeTask;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Singleton
@Module
public class ApplicationModule {
    @Provides
//    @Singleton
    FakeTask provideFakeTask() {
        return new FakeTask();
    }
}
