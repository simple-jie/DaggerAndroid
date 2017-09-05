package com.simple_jie.daggerandroid.di;

import com.simple_jie.daggerandroid.CoreApp;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Xingbo.Jie on 5/9/17.
 */
@Component(modules = {AndroidSupportInjectionModule.class})
public interface CoreAppComponent extends AndroidInjector<CoreApp>{
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<CoreApp> {
    }
}
