package com.simple_jie.daggerandroid.di.module;

import com.simple_jie.daggerandroid.MainActivity;
import com.simple_jie.daggerandroid.ViewPagerActivity;
import com.simple_jie.daggerandroid.placeholder.PlaceholderFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Xingbo.Jie on 7/9/17.
 */
@Module
public abstract class BuildersModule {
//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bind(MainActivityComponent.Builder builder);

    @ContributesAndroidInjector
    abstract MainActivity mainActivityInjector();

    @ContributesAndroidInjector(modules = {ViewPagerActivityModule.class})
    abstract ViewPagerActivity viewPagerActivityInjector();

    @ContributesAndroidInjector(modules = {PlaceholderFragmentModule.class})
    abstract PlaceholderFragment placeholderFragmentInjector();

}
