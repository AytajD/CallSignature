package com.dadashova.aytaj.callsignature.containers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dadashova.aytaj.callsignature.R;
import com.dadashova.aytaj.callsignature.interfaces.SignatureCallBack;

import java.util.List;

public class CreatedSignatureAdapter extends RecyclerView.Adapter<SignatureViewHolder> {
    private List<SignatureModel> mList;
    private Context mContext;
    private SignatureCallBack mCallBack;

    public CreatedSignatureAdapter(Context mContext, List<SignatureModel> mList, SignatureCallBack mCallBack ) {

        this.mList = mList;
        this.mContext = mContext;
        this.mCallBack = mCallBack;
    }

    @NonNull
    @Override
    public SignatureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view =  layoutInflater.inflate( R.layout.item_created_signature,viewGroup, false);


        return new SignatureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SignatureViewHolder viewHolder, int i) {

        viewHolder.mSignature.setText(mList.get(i).getmSignature());
        viewHolder.mSignatureRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallBack.onSignatureClicked(viewHolder.mSignature.getText().toString());


            }
        });


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

}


