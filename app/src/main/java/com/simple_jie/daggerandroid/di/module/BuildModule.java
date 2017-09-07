package com.simple_jie.daggerandroid.di.module;

import android.os.Build;

import com.simple_jie.daggerandroid.di.CodeName;
import com.simple_jie.daggerandroid.di.Model;

import dagger.Module;
import dagger.Provides;

import static android.os.Build.MODEL;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */

@Module
public final class BuildModule {
    @Model
    @Provides
    static String provideModel() {
        return MODEL;
    }

    @CodeName
    @Provides
    static String provideCodeName() {
        return Build.VERSION.CODENAME;
    }
}
