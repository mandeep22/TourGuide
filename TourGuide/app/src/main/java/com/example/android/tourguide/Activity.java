package com.example.android.tourguide;

/**
 * Created by MS on 8/14/2016.
 */
public class Activity {
    private String mName;
    private String mCost;
    private String mAddress;
    private String mPhone;
    private int mImageResourceId;

    public Activity(String name, String cost, String address, String phone) {
        mName = name;
        mCost = cost;
        mAddress = address;
        mPhone = phone;
    }

    public Activity(String name, String cost, String address, String phone, int imageResourceId) {
        mName = name;
        mCost = cost;
        mAddress = address;
        mPhone = phone;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getCost() {
        return mCost;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        if (mImageResourceId != -1) {
            return true;
        }
        return false;
    }
}
