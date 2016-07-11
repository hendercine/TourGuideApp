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
public class ToStayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array list of places to see and info about them
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Sportsmen's Lodge",
                "Updated rooms with trendy dining, a pool & free Universal Studio shuttles. " +
                        "Great for the 'out-of-towner' who doesn't want something too " +
                        "'Hollywood'.", R.drawable.place_holder));
        places.add(new Place("The Enchanted Mansion",
                "Name says it all! Popular wedding and honeymoon spot, but It does not have to " +
                        "be event, it can just be a romantic weekend.", R.drawable.place_holder));
        places.add(new Place("The Plaza Apartments",
                "If you're staying indefinitely, this is highly rated with hot tub, " +
                        "pool and an awesome building manager!", R.drawable.place_holder));
        places.add(new Place("Coldwater Apartments",
                "Well maintained, updated apartments with a pool and a great mix of tenants! " +
                        "Relaxed building manager and perfect Sherman Village location!",
                R.drawable.place_holder));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_to_stay);

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