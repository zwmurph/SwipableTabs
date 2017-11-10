package com.example.android.swipabletabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Class that controls the creation of the second fragment.
 * Everything can be put inside of it, like a normal class.
 */
public class SecondFragment extends Fragment {

    public static SecondFragment newInstance(String text) {
        SecondFragment f = new SecondFragment();
        return f;
    }

    /**
     * Handle this method as a normal 'onCreate' method, but make sure that all commands are
     * inserted before 'return v'.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.second_frag, container, false);
        return v;
    }
}