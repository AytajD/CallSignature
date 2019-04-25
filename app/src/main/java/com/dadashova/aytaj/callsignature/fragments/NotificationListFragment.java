package com.dadashova.aytaj.callsignature.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.R;
import com.dadashova.aytaj.callsignature.containers.CallsAdapter;
import com.dadashova.aytaj.callsignature.containers.CreatedSignatureAdapter;
import com.dadashova.aytaj.callsignature.containers.NotificationAdapter;
import com.dadashova.aytaj.callsignature.containers.NotificationModel;
import com.dadashova.aytaj.callsignature.containers.SignatureModel;
import com.dadashova.aytaj.callsignature.interfaces.NotificationCallBack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationListFragment extends Fragment {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private List<NotificationModel> mList;
    private NotificationAdapter mAdapter;


    public NotificationListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        ButterKnife.bind(this, view);

        getNotifData();
        return view;
    }

    private void getNotifData() {

        mList = new ArrayList<>();

        NotificationModel model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Indi");
        mList.add(model);

        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","26 mart");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Sabah:D");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);
        model = new NotificationModel(R.drawable.drawable_profile_pic,
                "Lorem ipsum dolor sit amet,",
                "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit, sed do","Dunen");
        mList.add(model);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        mAdapter = new NotificationAdapter(getContext(), mList, new NotificationCallBack() {
            @Override
            public void onNotifClicked(String date, String body) {

                final Bundle bundle = new Bundle();
                bundle.putString("date", date);
                bundle.putString("body", body);

                final NotificationFragment notificationFragment = NotificationFragment.newInstance(new NotificationCallBack() {
                    @Override
                    public void onNotifClicked(String date, String body) {


                    }
                });

                notificationFragment.setArguments(bundle);
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container,
                         notificationFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

}
