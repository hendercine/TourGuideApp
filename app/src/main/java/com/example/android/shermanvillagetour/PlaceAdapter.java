package com.example.android.shermanvillagetour;

/**
 * Created by Hendercine on 7/6/16.
 */
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);

        mColorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID venue_name_text_view
        TextView venueNameTextView = (TextView) listItemView.findViewById(R.id.venue_name_text_view);
        // Get the venue name from the current Place object and set this text on the
        // venueName TextView
        venueNameTextView.setText(currentPlace.getVenueName());


        // Find the TextView in the list_item.xml layout with the ID venue_description_text_view
        TextView venueDescriptionTextView = (TextView) listItemView.findViewById(R.id.venue_description_text_view);
        // Get the venueDescription from the current Place object and set this text on the venueDescription TextView
        venueDescriptionTextView.setText(currentPlace.getVenueDescription());

        //TODO: Set venue description text link to associated website

        // Find the TextView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentPlace.getImageResourceId());

        //TODO: Set image view link to associated map link

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
