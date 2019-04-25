package com.dadashova.aytaj.callsignature.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.containers.CreatedSignatureAdapter;
import com.dadashova.aytaj.callsignature.containers.SignatureBottomSheetFragment;
import com.dadashova.aytaj.callsignature.containers.SignatureModel;
import com.dadashova.aytaj.callsignature.R;
import com.dadashova.aytaj.callsignature.interfaces.SignatureCallBack;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreatedSignatureFragment extends Fragment  {

    public static final String BOTTOM_SHEET_TAG = "BottomSheet";
    public static final String CHANGE_SIGNATURE_TAG = "ChangeSignatureFragment";


    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.text_signature)
    TextView mSignature;

    private List<SignatureModel> mList;
    private CreatedSignatureAdapter mAdapter;

    SignatureBottomSheetFragment clickedSignatureBottomSheet;
    public CreatedSignatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_created_signature, container, false);
        ButterKnife.bind(this, view);

        if (getArguments()!=null){
            mSignature.setText(getArguments().getString("activate"));
        }

        getCallData();

        return view;
    }

    private void getCallData() {
        mList = new ArrayList<>();
        SignatureModel model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir");
        mList.add(model);

        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar anadir..sdfghjkdfghjkesrdftgjkrdftgyhfdghjkrdfgtj.Bu gun 8 mart bayramidir\nQadinlar anadir");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nTebrikler...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);
        model = new SignatureModel("Bu gun 8 mart bayramidir\nQadinlar bas tacidir...");
        mList.add(model);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        mAdapter = new CreatedSignatureAdapter(getContext(), mList, new SignatureCallBack() {
            @Override
            public void onSignatureClicked(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("signature", str);

          clickedSignatureBottomSheet=
                        SignatureBottomSheetFragment.newInstance(new SignatureCallBack() {
                    @Override
                    public void onSignatureClicked(String str) {


                    }

                    @Override
                    public void onActivateClicked(String str) {

                        Log.e("LOG_SELECTED_SIGN",str);

                        mSignature.setText(str);
                        clickedSignatureBottomSheet.dismiss();



                    }
                });

                clickedSignatureBottomSheet.setArguments(bundle);

                clickedSignatureBottomSheet.show(getActivity().getSupportFragmentManager(),BOTTOM_SHEET_TAG);


            }

            @Override
            public void onActivateClicked(String str) {





            }
        });

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }

    @OnClick(R.id.button_add)
    public void addSignature(Button mAdd) {

        getActivity()

                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,
                        new ChangeSignatureFragment(),
                        CHANGE_SIGNATURE_TAG)
                .addToBackStack(null)
                .commit();

    }


}
