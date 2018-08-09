package com.example.kkchain.nanodegree_project5_tourguideapp;

public class ListItem {

    private int mShopName;

    private int mShopAddress;

    // Get the shop name  and address from array list
    public ListItem(int name, int address){
        mShopName = name;
        mShopAddress = address;
    }


    public int getTheShopName(){
        return mShopName;
    }

    public int getTheShopAddress(){
        return mShopAddress;
    }

}
