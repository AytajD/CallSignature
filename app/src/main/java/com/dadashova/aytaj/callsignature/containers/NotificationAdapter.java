package com.dadashova.aytaj.callsignature.containers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dadashova.aytaj.callsignature.R;
import com.dadashova.aytaj.callsignature.interfaces.NotificationCallBack;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotifViewHolder> {
    private List<NotificationModel> mList;
    private Context mContext;
    private NotificationCallBack mCallBack;

    public NotificationAdapter( Context mContext,List<NotificationModel> mList, NotificationCallBack mCallBack) {
        this.mList = mList;
        this.mContext = mContext;
        this.mCallBack = mCallBack;
    }

    @NonNull
    @Override
    public NotifViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view =  layoutInflater.inflate( R.layout.item_notification,viewGroup, false);



        return new NotifViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final NotifViewHolder notifViewHolder, int i) {

        notifViewHolder.mNotifTitle.setText(mList.get(i).getmNotifTitle());
        notifViewHolder.mNotifBody.setText(mList.get(i).getmNotifBody());
         notifViewHolder.mDate.setText(mList.get(i).getmDate());

        notifViewHolder.mNotifBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCallBack.onNotifClicked(notifViewHolder.mDate.getText().toString(),
                notifViewHolder.mNotifBody.getText().toString());
            }
        });




    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
