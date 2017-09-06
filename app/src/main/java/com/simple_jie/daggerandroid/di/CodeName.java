package com.simple_jie.daggerandroid.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Xingbo.Jie on 6/9/17.
 */

@Qualifier
@Retention(RUNTIME)
@Documented
public @interface CodeName {
}
