package com.simple_jie.daggerandroid.di;

import com.simple_jie.daggerandroid.ViewPagerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Subcomponent
public interface PlaceholderFragmentComponent extends AndroidInjector<ViewPagerActivity.PlaceholderFragment>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ViewPagerActivity.PlaceholderFragment> {
    }
}
