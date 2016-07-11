package com.example.android.shermanvillagetour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ToEatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //TODO: Expand ArrayList to five inputs to include links to venue map and website

        // Create an array list of places to eat and info about them
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Hugo's Tacos",
                "Addictive walk-up tacos, burritos and more! " +
                        "The honey-chiplotle is almost drinkable!", R.drawable.hugos_tacos));
        places.add(new Place("Pagliacci's",
                "Impressive Italian that also delivers via GrubHub! " +
                        "Not cheap but the bolognese is just incredible!", R.drawable.pagliaccis));
        places.add(new Place("Harvest Moon",
                "Breakfast! Insanely amazing bacon! Like seriously... " +
                        "they call it 'sweet & spicy bacon'!", R.drawable.harvest_moon));
        places.add(new Place("Five Guys",
                "Just a burger joint but you can pre-order online" +
                        " and the cajun fries are bomb!", R.drawable.five_guys));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_to_eat);

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
