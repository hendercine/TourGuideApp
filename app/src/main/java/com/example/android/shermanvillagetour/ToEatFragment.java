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

        // Create an array list of places to eat and info about them
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Hugo's", "lutti", R.drawable.number_one));
        places.add(new Place("Pagliacci's", "otiiko", R.drawable.number_two));
        places.add(new Place("three", "tolookosu", R.drawable.number_three));
        places.add(new Place("four", "oyyisa", R.drawable.number_four));
        places.add(new Place("five", "massokka", R.drawable.number_five));
        places.add(new Place("six", "temmokka", R.drawable.number_six));
        places.add(new Place("seven", "kenekaku", R.drawable.number_seven));
        places.add(new Place("eight", "kawinta", R.drawable.number_eight));
        places.add(new Place("nine", "wo’e", R.drawable.number_nine));
        places.add(new Place("ten", "na’aacha", R.drawable.number_ten));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_to_eat);

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
