package com.dadashova.aytaj.callsignature.containers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dadashova.aytaj.callsignature.R;

import java.util.List;

public class CallsAdapter extends RecyclerView.Adapter<CallsViewHolder> {

    private List<CallModel> mList;
    private Context mContext;

    public CallsAdapter(Context mContext, List<CallModel> mList ) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CallsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view =  layoutInflater.inflate( R.layout.item_call_list,viewGroup, false);

        return new CallsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallsViewHolder viewHolder, int i) {

        viewHolder.mProfileImage.setImageResource(mList.get(i).getmProfileImage());
        viewHolder.mName.setText(mList.get(i).getmName());
        viewHolder.mDate.setText(mList.get(i).getmDate());
        viewHolder.mCallType.setImageResource(mList.get(i).getmCallType());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
