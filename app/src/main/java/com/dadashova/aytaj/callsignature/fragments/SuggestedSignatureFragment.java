package com.dadashova.aytaj.callsignature.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dadashova.aytaj.callsignature.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuggestedSignatureFragment extends Fragment {


    public SuggestedSignatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_suggested_signature, container, false);

        return view;
    }

}
