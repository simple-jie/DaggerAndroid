package com.simple_jie.daggerandroid.di.module;

import com.simple_jie.daggerandroid.di.Model;
import com.simple_jie.daggerandroid.domain.FakeTask;
import com.simple_jie.daggerandroid.domain.SingletonFakeTask;
import com.simple_jie.daggerandroid.placeholder.AbstractData;
import com.simple_jie.daggerandroid.placeholder.DataImpl;
import com.simple_jie.daggerandroid.placeholder.ParameterPresenter;
import com.simple_jie.daggerandroid.placeholder.PlaceHolderContract;
import com.simple_jie.daggerandroid.placeholder.PlaceHolderPresenter;
import com.simple_jie.daggerandroid.placeholder.PlaceholderFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */
@Module
public abstract class PlaceholderFragmentModule {
    @Binds
    abstract PlaceHolderContract.View provideView(PlaceholderFragment fragment);

    @Provides @Named("UID")
    static String provideUid(PlaceholderFragment fragment) {
        return fragment.getUid();
    }

    @Binds
    @Named("parameter")
    abstract PlaceHolderContract.Presenter provideParameter(ParameterPresenter parameterPresenter);

    @Binds
    abstract AbstractData provideData(DataImpl data);

    @Provides
    static PlaceHolderContract.Presenter providePresenter(PlaceholderFragment fragment, FakeTask task, SingletonFakeTask singletonFakeTask, @Model String model) {
        return new PlaceHolderPresenter(fragment.getActivity(), task, singletonFakeTask, fragment, model);
    }
}
