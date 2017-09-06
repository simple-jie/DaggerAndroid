package com.simple_jie.daggerandroid.di.module;

import com.simple_jie.daggerandroid.di.Model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static android.os.Build.MODEL;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */

@Singleton
@Module
public final class BuildModule {
    @Model
    @Provides
    static String provideModel() {
        return MODEL;
    }
}
