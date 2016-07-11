package com.example.android.shermanvillagetour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToShopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array list of places to shop and info about them
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Whole Foods",
                "Groceries for the health and environmentally conscious! Don't expect bargains " +
                        "but you get what you pay for!", R.drawable.place_holder));
        places.add(new Place("Raplh's",
                "Groceries for the dollar conscious! Inviting layout and decent organic " +
                        "selection, this Ralphs is among the better ones!",
                R.drawable.place_holder));
        places.add(new Place("Trader Joe's",
                "A bit further outside of Sherman Village, if Whole Foods and Ralphs had a baby, " +
                        "they'd surely name it Joe.", R.drawable.place_holder));
        places.add(new Place("Ventura Blvd Window Shopping",
                "So many niche stores that the street deserves its own listing! Just a stroll " +
                        "down Ventura between Whitsett and Laurel Canyon is fun!",
                R.drawable.place_holder));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_to_shop);

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