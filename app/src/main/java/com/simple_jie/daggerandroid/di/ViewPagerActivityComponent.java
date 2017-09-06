package com.simple_jie.daggerandroid.di;

import com.simple_jie.daggerandroid.ViewPagerActivity;
import com.simple_jie.daggerandroid.di.module.PlaceholderFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Subcomponent(modules = PlaceholderFragmentModule.class)
public interface ViewPagerActivityComponent extends AndroidInjector<ViewPagerActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ViewPagerActivity> {
    }
}
