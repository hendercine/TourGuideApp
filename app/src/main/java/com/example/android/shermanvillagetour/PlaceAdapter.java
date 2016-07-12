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

        // Get the current Place and set the image, title and description.
        Place currentPlace = getItem(position);

        TextView venueNameTextView = (TextView) listItemView.findViewById(R.id.venue_name_text_view);
        venueNameTextView.setText(currentPlace.getVenueName());

        TextView venueDescriptionTextView = (TextView) listItemView.findViewById(R.id.venue_description_text_view);
        venueDescriptionTextView.setText(currentPlace.getVenueDescription());

        //TODO: Set venue description text link to associated website

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResourceId());

        //TODO: Set image view link to associated map link

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
