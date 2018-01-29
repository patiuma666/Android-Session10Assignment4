package com.example.iis5.actionbarexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FragmentTab2 extends Fragment {
    public FragmentTab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflates the layout with this fragment that can be used to inflate any views in the fragment,
        //View	Return the View for the fragment's UI
        View view=inflater.inflate(R.layout.fragment_fragment_tab2, container, false);
        return view;
    }

}