package com.dadashova.aytaj.callsignature.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dadashova.aytaj.callsignature.fragments.CallListsFragment;
import com.dadashova.aytaj.callsignature.R;

public class MainActivity extends AppCompatActivity {


    public static final String CALL_LIST_FRAGMENT_TAG = "CallList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new CallListsFragment(),
                CALL_LIST_FRAGMENT_TAG)
                .commit();
    }

}
