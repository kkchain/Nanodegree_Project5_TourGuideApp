
package com.example.kkchain.nanodegree_project5_tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Fragment that displays "Food"
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<ListItem>();

        listItems.add(new ListItem(R.string.food_name,R.string.food_address,R.string.food_special,
                R.drawable.food_superbowl));
        listItems.add(new ListItem(R.string.food2_name,R.string.food2_address,R.string.food2_hour,
                R.drawable.food_kripy));


        // Create a link to Listview and apply adapter
        ListAdapter adapter = new ListAdapter(getActivity(), listItems);
        ListView listV = rootView.findViewById(R.id.list);
        listV.setAdapter(adapter);

        return rootView;

    }

}