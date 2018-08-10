package com.example.kkchain.nanodegree_project5_tourguideapp;

public class ListItem {

    private int mName;

    private int mAddress;

    private int mphone;

    private int mInformation;

    private int mImageResourceId;

    // Get the shop name  and address from array list
    public ListItem(int name, int address, int phone, int image){
        mName = name;
        mAddress = address;
        mphone = phone;
        mImageResourceId = image;
    }


    public int getTheName(){
        return mName;
    }

    public int getTheAddress(){
        return mAddress;
    }

    public int getThePhone(){
        return mphone;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}
