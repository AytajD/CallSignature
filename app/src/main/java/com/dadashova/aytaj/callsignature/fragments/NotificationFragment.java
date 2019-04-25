package com.dadashova.aytaj.callsignature.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.R;
import com.dadashova.aytaj.callsignature.containers.SignatureBottomSheetFragment;
import com.dadashova.aytaj.callsignature.interfaces.NotificationCallBack;
import com.dadashova.aytaj.callsignature.interfaces.SignatureCallBack;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    public static NotificationCallBack mCallBack;

    @BindView(R.id.text_date)
    TextView mDate;

    @BindView(R.id.text_notification)
    TextView mBody;


    public NotificationFragment() {
        // Required empty public constructor
    }


    public static NotificationFragment newInstance(NotificationCallBack CallBack) {
        mCallBack  = CallBack;

        NotificationFragment fragment = new NotificationFragment();


        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        ButterKnife.bind(this, view);

        if (getArguments()!=null){
            String date = getArguments().getString("date");
            String body = getArguments().getString("body");
            mDate.setText(date);
            mBody.setText(body);


        }
        return view;
    }

}
