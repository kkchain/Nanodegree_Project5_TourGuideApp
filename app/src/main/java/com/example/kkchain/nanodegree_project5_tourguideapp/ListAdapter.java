package com.example.kkchain.nanodegree_project5_tourguideapp;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter <LauncherActivity.ListItem> {



    public ListAdapter(Context context, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_view, parent, false);
        }

        LauncherActivity.ListItem currentList = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_text_view.
        TextView tourTextView = listItemView.findViewById(R.id.shop_name);
        tourTextView.setText(currentList.getTheShopName());

        TextView tourTextView2 = listItemView.findViewById(R.id.shop_address);
        tourTextView2.setText(currentList.getTheShopAddress());

        return listItemView;
    }
}
