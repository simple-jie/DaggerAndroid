package com.simple_jie.daggerandroid.di;

import com.simple_jie.daggerandroid.placeholder.PlaceholderFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Subcomponent
public interface PlaceholderFragmentComponent extends AndroidInjector<PlaceholderFragment>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceholderFragment> {
    }
}
