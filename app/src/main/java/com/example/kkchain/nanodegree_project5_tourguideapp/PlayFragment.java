
package com.example.kkchain.nanodegree_project5_tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Fragment that displays "Play"
 */
public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<ListItem>();

        listItems.add(new ListItem(R.string.play_name,R.string.play_address,R.string.play_hour,
                R.drawable.play_kid));
        listItems.add(new ListItem(R.string.play2_name,R.string.play2_address,R.string.play2_special,
                R.drawable.play_bounce));


        // Create a link to Listview and apply adapter
        ListAdapter adapter = new ListAdapter(getActivity(), listItems);
        ListView listV = rootView.findViewById(R.id.list);
        listV.setAdapter(adapter);

        return rootView;

    }


}