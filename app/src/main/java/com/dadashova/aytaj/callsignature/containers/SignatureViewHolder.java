package com.dadashova.aytaj.callsignature.containers;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignatureViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_signature)
    TextView mSignature;
    @BindView(R.id.constraint_signature_row)
    ConstraintLayout mSignatureRow;

    public SignatureViewHolder(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);



    }
}
