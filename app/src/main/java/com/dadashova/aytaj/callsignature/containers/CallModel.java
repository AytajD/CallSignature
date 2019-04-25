package com.dadashova.aytaj.callsignature.containers;

public class CallModel {

    private int mProfileImage;
    private String mName;
    private String mDate;
    private int mCallType;

    public CallModel(int mProfileImage, String mName, String mDate, int mCallType) {
        this.mProfileImage = mProfileImage;
        this.mName = mName;
        this.mDate = mDate;
        this.mCallType = mCallType;
    }

    public int getmProfileImage() {
        return mProfileImage;
    }

    public void setmProfileImage(int mProfileImage) {
        this.mProfileImage = mProfileImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public int getmCallType() {
        return mCallType;
    }

    public void setmCallType(int mCallType) {
        this.mCallType = mCallType;
    }
}
