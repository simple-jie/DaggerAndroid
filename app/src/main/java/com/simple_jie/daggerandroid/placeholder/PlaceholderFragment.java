package com.simple_jie.daggerandroid.placeholder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.simple_jie.daggerandroid.R;
import com.simple_jie.daggerandroid.domain.FakeTask;
import com.simple_jie.daggerandroid.domain.SingletonFakeTask;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends DaggerFragment {
    @Inject
    FakeTask task;

    @Inject
    SingletonFakeTask singletonFakeTask;
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        StringBuilder builder = new StringBuilder(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        builder.append('\n');
        builder.append("Fake task " + task.hashCode());
        builder.append('\n');
        builder.append("Inject singletonFakeTask = " + (singletonFakeTask == null ? "null" : singletonFakeTask.hashCode()));
        textView.setText(builder.toString());
        return rootView;
    }
}
