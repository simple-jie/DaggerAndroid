package com.simple_jie.daggerandroid.placeholder;

/**
 * Created by Xingbo.Jie on 7/9/17.
 */

public interface PlaceHolderContract {
    interface View {
        void renderText(String text);
    }

    interface Presenter {
        void start();
    }
}
