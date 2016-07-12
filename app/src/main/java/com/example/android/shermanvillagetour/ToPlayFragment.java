package com.example.android.shermanvillagetour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ToPlayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //TODO: Expand ArrayList to five inputs to include links to venue map and website

        // Create an array list of places to play and info about them
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.rec_center_title,
                R.string.rec_center_desc, R.drawable.place_holder));
        places.add(new Place(R.string.weddington_title,
                R.string.weddington_desc,
                R.drawable.place_holder));
        places.add(new Place(R.string.pinz_title,
                R.string.pinz_desc, R.drawable.place_holder));
        places.add(new Place(R.string.cbs_title,
                R.string.cbs_desc, R.drawable.place_holder));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_to_play);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        //TODO: Add onClickListener for each image to display map via implicit intent
        //TODO: Add onClickListener for each textview to link to venue website via implicit intent

        return rootView;
    }

}