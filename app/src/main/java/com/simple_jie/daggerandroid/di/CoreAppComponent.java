package com.simple_jie.daggerandroid.di;

import com.simple_jie.daggerandroid.CoreApp;
import com.simple_jie.daggerandroid.di.module.ApplicationModule;
import com.simple_jie.daggerandroid.di.module.BuildModule;
import com.simple_jie.daggerandroid.di.module.MainActivityModule;
import com.simple_jie.daggerandroid.di.module.ViewPagerActivityModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Xingbo.Jie on 5/9/17.
 */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ApplicationModule.class, BuildModule.class,
        MainActivityModule.class,
        ViewPagerActivityModule.class})
public interface CoreAppComponent extends AndroidInjector<CoreApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<CoreApp> {
    }
}
