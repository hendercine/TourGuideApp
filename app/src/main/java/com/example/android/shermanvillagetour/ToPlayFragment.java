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

        // Create an array list of places to play and info about them
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Studio City Rec Center",
                "Huge and inclusive play structure for kids. Ramps, slides, monkey bats, swings " +
                        "and even a sandy play area!", R.drawable.place_holder));
        places.add(new Place("Weddington Golf and Tennis",
                "Twelve dollar 9-hole and eight dollar replays right in the middle of the " +
                        "neighborhood! Driving range and tennis courts too!",
                R.drawable.place_holder));
        places.add(new Place("Pinz Bowling Center",
                "Huge late-night bowling lanes, billiards & arcade, plus a restaurant & bar. " +
                        "Open until 1AM; 2AM on the weekend!", R.drawable.place_holder));
        places.add(new Place("CBS Radford Studio Center",
                "Be an audience member at a live studio taping! Daytime talk-shows and sitcoms, " +
                        "the tickets are free!", R.drawable.place_holder));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_to_play);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}