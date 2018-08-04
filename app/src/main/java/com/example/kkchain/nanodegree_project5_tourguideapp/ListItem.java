package com.example.kkchain.nanodegree_project5_tourguideapp;

public class ListItem {

    private String mShopName;

    private String mShopAddress;

    // Get the shop name  and address from array list
    public ListItem(String name, String address){
        mShopName = name;
        mShopAddress = address;
    }

    public String getTheShopName(){
        return mShopName;
    }

    public String getTheShopAddress(){
        return mShopAddress;
    }

}
