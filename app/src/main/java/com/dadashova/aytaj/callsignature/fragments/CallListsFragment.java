package com.dadashova.aytaj.callsignature.fragments;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.containers.CallModel;
import com.dadashova.aytaj.callsignature.containers.CallsAdapter;
import com.dadashova.aytaj.callsignature.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class CallListsFragment extends Fragment {
    public static final String CALL_LIST_TAG = "main";
    public static final String NOTIF_LIST_TAG = "notif";
    public static final String CHANGE_SIGNATURE_TAG = "ChangeSignatureFragment";
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    private List<CallModel> mList;
    private CallsAdapter mAdapter;
    @BindView(R.id.text_change)
    TextView mChange;
    @BindView(R.id.button_back)
    Button mDebug1;
    @BindView(R.id.button_search)
    Button mDebug2;


    public CallListsFragment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call_lists, container, false);
        ButterKnife.bind(this, view);


    mDebug1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            MySignatureFragment nextFrag= new MySignatureFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, nextFrag, CALL_LIST_TAG)
                    .addToBackStack(null)
                    .commit();



        }
    });

    mDebug2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            NotificationListFragment fragment = new NotificationListFragment();
            getActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment,NOTIF_LIST_TAG)
                    .addToBackStack(null)
                    .commit();
        }
    });

        mList = new ArrayList<>();

        getCallData();



        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void getCallData() {

        CallModel model = new CallModel(R.drawable.drawable_profile_pic,
                "Aytaj",
                "Bazar ertesi, 20:08, Mobil",
                R.drawable.ic_arrow_down_left);
        mList.add(model);

        model = new CallModel(R.drawable.drawable_profile_pic,
                "Kenan",
                "Bazar, 20:08, Mobil",
                R.drawable.ic_arrow_right_down);
        mList.add(model);
        model = new CallModel(R.drawable.drawable_profile_pic,
                "+994 50 890 76 56",
                "Senbe, 20:08, +994 50 890 35 23",
                R.drawable.ic_arrow_up_left);
        mList.add(model);
        model = new CallModel(R.drawable.drawable_profile_pic,
                "Crocusoft",
                "Bazar ertesi, 20:08, Mobil",
                R.drawable.ic_arrow_down_left);
        mList.add(model);
        model = new CallModel(R.drawable.drawable_profile_pic,
                "Elesger Dayi",
                "Bazar ertesi, 20:08, Mobil",
                R.drawable.ic_arrow_right_down);
        mList.add(model);

        model = new CallModel(R.drawable.drawable_profile_pic,
                "Kenan",
                "Bazar, 20:08, Mobil",
                R.drawable.ic_arrow_right_down);
        mList.add(model);
        model = new CallModel(R.drawable.drawable_profile_pic,
                "+994 50 890 76 56",
                "Senbe, 20:08, +994 50 890 35 23",
                R.drawable.ic_arrow_up_left);
        mList.add(model);
        model = new CallModel(R.drawable.drawable_profile_pic,
                "Crocusoft",
                "Bazar ertesi, 20:08, Mobil",
                R.drawable.ic_arrow_down_left);
        mList.add(model);
        model = new CallModel(R.drawable.drawable_profile_pic,
                "Elesger Dayi",
                "Bazar ertesi, 20:08, Mobil",
                R.drawable.ic_arrow_right_down);
        mList.add(model);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        mAdapter = new CallsAdapter(getContext(), mList);
        DividerItemDecoration itemDecorator = new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL);

        itemDecorator.setDrawable(Objects.requireNonNull(ContextCompat.getDrawable(getContext(),
                R.drawable.drawable_item_decorator)));

        mRecyclerView.addItemDecoration(itemDecorator);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


    @OnClick(R.id.text_change)
    public void changeSignature(TextView mChange) {

        ChangeSignatureFragment changeSignatureFragment= new ChangeSignatureFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, changeSignatureFragment, CHANGE_SIGNATURE_TAG)
                .addToBackStack(null)
                .commit();


    }


}
