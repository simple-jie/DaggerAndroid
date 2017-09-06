package com.simple_jie.daggerandroid.di.module;

import android.app.Activity;

import com.simple_jie.daggerandroid.MainActivity;
import com.simple_jie.daggerandroid.di.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Module(subcomponents = MainActivityComponent.class)
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bind(MainActivityComponent.Builder builder);
}
