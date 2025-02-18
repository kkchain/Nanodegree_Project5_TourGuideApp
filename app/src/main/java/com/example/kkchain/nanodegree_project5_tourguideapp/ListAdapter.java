package com.example.kkchain.nanodegree_project5_tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter <ListItem> {

    public ListAdapter(Context context, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.activity_list_view, parent, false);
        }

        ListItem currentList = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_text_view.
        TextView t1 = listItemView.findViewById(R.id.name);
        t1.setText(currentList.getTheName());

        TextView t2 = listItemView.findViewById(R.id.address);
        t2.setText(currentList.getTheAddress());

        TextView t3 = listItemView.findViewById(R.id.phone);
        t3.setText(currentList.getThePhone());

        ImageView t5 = listItemView.findViewById(R.id.photo);
        t5.setImageResource(currentList.getImageResourceId());

        return listItemView;
    }
}
