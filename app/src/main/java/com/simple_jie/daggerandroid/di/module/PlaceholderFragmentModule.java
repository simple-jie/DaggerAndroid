package com.simple_jie.daggerandroid.di.module;

import com.simple_jie.daggerandroid.di.Model;
import com.simple_jie.daggerandroid.domain.FakeTask;
import com.simple_jie.daggerandroid.domain.SingletonFakeTask;
import com.simple_jie.daggerandroid.placeholder.PlaceHolderContract;
import com.simple_jie.daggerandroid.placeholder.PlaceHolderPresenter;
import com.simple_jie.daggerandroid.placeholder.PlaceholderFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Module
public class PlaceholderFragmentModule {

    @Provides
    PlaceHolderContract.Presenter providePresenter(PlaceholderFragment fragment, FakeTask task, SingletonFakeTask singletonFakeTask, @Model String model) {
        return new PlaceHolderPresenter(fragment.getActivity(), task, singletonFakeTask, fragment, model);
    }
}
