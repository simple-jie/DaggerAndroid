package com.simple_jie.daggerandroid.di.module;

import android.app.Activity;
import android.os.Build;

import com.simple_jie.daggerandroid.ViewPagerActivity;
import com.simple_jie.daggerandroid.di.CodeName;
import com.simple_jie.daggerandroid.di.ViewPagerActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Module(subcomponents = ViewPagerActivityComponent.class)
public abstract class ViewPagerActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(ViewPagerActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bind(ViewPagerActivityComponent.Builder builder);

    @CodeName
    @Provides
    static String provideCodeName() {
        return Build.VERSION.CODENAME;
    }
}
