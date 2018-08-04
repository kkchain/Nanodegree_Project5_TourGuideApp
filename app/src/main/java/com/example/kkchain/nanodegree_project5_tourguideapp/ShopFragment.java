package com.example.kkchain.nanodegree_project5_tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_shop, container, false);

        final ArrayList <ListItem> listItems = new ArrayList<ListItem>();

        listItems.add(new ListItem("Mall Name", "Mall Address"));
        listItems.add(new ListItem("Mall Name2", "Mall Address2"));

        // Create a link to Listview and apply adapter
        ListAdapter adapter = new ListAdapter(this, listItems);
        ListView listV = findViewById(R.id.shop_listView);
        listV.setAdapter(adapter);

        return rootView;

    }

}