package com.dadashova.aytaj.callsignature.containers;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotifViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_notification_title)
    TextView mNotifTitle;
    @BindView(R.id.text_notification_body)
    TextView mNotifBody;

    @BindView(R.id.text_date)
    TextView mDate;

    public NotifViewHolder(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);



    }
}
