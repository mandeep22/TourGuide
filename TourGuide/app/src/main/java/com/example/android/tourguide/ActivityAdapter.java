package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MS on 8/14/2016.
 */
public class ActivityAdapter extends ArrayAdapter<Activity> {

    private int mColorResourceId;

    public ActivityAdapter(Context context, ArrayList<Activity> activities, int colorResourceId) {
        super(context, 0, activities);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if existing view is being used otherwise inflate a new view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Activity currentActivity = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name_text_view);
        name.setText(currentActivity.getName());
        TextView cost = (TextView) listItemView.findViewById(R.id.cost_text_view);
        cost.setText(currentActivity.getCost());
        TextView address = (TextView) listItemView.findViewById(R.id.address_text_view);
        address.setText(currentActivity.getAddress());
        TextView phone = (TextView) listItemView.findViewById(R.id.phone_text_view);
        phone.setText(currentActivity.getPhone());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setVisibility(View.GONE);
        if (currentActivity.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentActivity.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
