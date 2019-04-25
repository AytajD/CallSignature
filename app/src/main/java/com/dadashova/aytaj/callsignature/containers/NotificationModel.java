package com.dadashova.aytaj.callsignature.containers;

public class NotificationModel {

    int mProfileImage;
    String mNotifTitle;
    String mNotifBody;
    String mDate;

    public NotificationModel(int mProfileImage, String mNotifTitle, String mNotifBody, String mDate) {
        this.mProfileImage = mProfileImage;
        this.mNotifTitle = mNotifTitle;
        this.mNotifBody = mNotifBody;
        this.mDate = mDate;
    }

    public void setmProfileImage(int mProfileImage) {
        this.mProfileImage = mProfileImage;
    }

    public void setmNotifTitle(String mNotifTitle) {
        this.mNotifTitle = mNotifTitle;
    }

    public void setmNotifBody(String mNotifBody) {
        this.mNotifBody = mNotifBody;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public int getmProfileImage() {
        return mProfileImage;
    }

    public String getmNotifTitle() {
        return mNotifTitle;
    }

    public String getmNotifBody() {
        return mNotifBody;
    }

    public String getmDate() {
        return mDate;
    }
}
