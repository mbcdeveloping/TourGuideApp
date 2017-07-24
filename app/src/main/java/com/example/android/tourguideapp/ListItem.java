package com.example.android.tourguideapp;

/**
 * Created by BogdanMihalca(@MBC) on 7/5/2017.
 */

public class ListItem {
    private String mTitle;
    private String mDescription;
    private int mImageresID;

    public ListItem(String title, String description, int imageResID) {
        mTitle = title;
        mDescription = description;
        mImageresID = imageResID;

    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageresID() {
        return mImageresID;
    }


}
