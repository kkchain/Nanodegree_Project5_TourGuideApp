package com.example.kkchain.nanodegree_project5_tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Fragment that displays "Shop"
 */
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList <ListItem> listItems = new ArrayList<ListItem>();

        listItems.add(new ListItem(R.string.shop_name,R.string.shop_address,R.string.shop_phone,
                R.drawable.shop_pearlandtowncenter));
        listItems.add(new ListItem(R.string.shop2_name,R.string.shop2_address,R.string.shop2_phone,
                R.drawable.shop_athome));


        // Create a link to Listview and apply adapter
        ListAdapter adapter = new ListAdapter(getActivity(), listItems);
        ListView listV = rootView.findViewById(R.id.list);
        listV.setAdapter(adapter);

        return rootView;

    }

}