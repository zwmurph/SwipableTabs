package com.example.android.swipabletabs;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Class that controls the creation of the first fragment.
 * Everything can be put inside of it, like a normal class.
 */
public class FirstFragment extends Fragment {

    public static FirstFragment newInstance(String text) {
        FirstFragment f = new FirstFragment();
        return f;
    }

    /**
     * Handle this method as a normal 'onCreate' method, but make sure that all commands are
     * inserted before 'return v'.
     * <p>
     * In addition, make sure that referencing 'findViewById' has a 'v.' before it so it knows
     * to look in this specific view.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);

        //Create a new button object constructor
        Button button = v.findViewById(R.id.toast);
        //Set a listener to it and create a new method
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Do this when the button is clicked
                toaster();
            }
        });

        return v;
    }

    /**
     * Method that creates a simple toast
     */
    public void toaster() {
        Context context = getActivity();
        CharSequence text = "The button worked!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}