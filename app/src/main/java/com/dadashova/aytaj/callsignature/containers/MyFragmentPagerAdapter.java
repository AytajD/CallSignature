package com.dadashova.aytaj.callsignature.containers;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dadashova.aytaj.callsignature.fragments.CreatedSignatureFragment;
import com.dadashova.aytaj.callsignature.fragments.SuggestedSignatureFragment;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
   public static final String TAB1_TITLE = "Yaratdıqlarım";
   public static final String TAB2_TITLE = "Təklif olunanlar";

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if(i==0) return new CreatedSignatureFragment();
        if(i==1) return new SuggestedSignatureFragment();
        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0) return TAB1_TITLE;
        if(position==1) return TAB2_TITLE;
        return super.getPageTitle(position);
    }
}
