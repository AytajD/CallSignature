package com.dadashova.aytaj.callsignature.containers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.R;
import com.dadashova.aytaj.callsignature.interfaces.SignatureCallBack;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignatureBottomSheetFragment extends BottomSheetDialogFragment {


    private static SignatureCallBack mCallBackInstance;

    public static final String SELECTED_SIGNATURE_KEY = "signature";

    @BindView(R.id.text_clicked_signature)
    TextView mSignature;

    public static SignatureBottomSheetFragment newInstance(SignatureCallBack mCallBack) {

        mCallBackInstance = mCallBack;

        SignatureBottomSheetFragment fragment = new SignatureBottomSheetFragment();


        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.signature_click_bottom_sheet, container, false);
        ButterKnife.bind(this, view);

        if (getArguments()!=null){

            String str = getArguments().getString(SELECTED_SIGNATURE_KEY);
            mSignature.setText(str);

        }


        return view;
    }

    @OnClick(R.id.text_activate)
    public void onActivateClicked(TextView mActivate) {

        mCallBackInstance.onActivateClicked(mSignature.getText().toString());




    }
}
