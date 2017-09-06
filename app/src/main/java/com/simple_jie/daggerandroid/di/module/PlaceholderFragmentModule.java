package com.simple_jie.daggerandroid.di.module;

import android.support.v4.app.Fragment;

import com.simple_jie.daggerandroid.ViewPagerActivity;
import com.simple_jie.daggerandroid.di.PlaceholderFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Module(subcomponents = PlaceholderFragmentComponent.class)
public abstract class PlaceholderFragmentModule {
    @Binds
    @IntoMap
    @dagger.android.support.FragmentKey(ViewPagerActivity.PlaceholderFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bind(PlaceholderFragmentComponent.Builder builder);
}
