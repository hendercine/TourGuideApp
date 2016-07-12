package com.example.android.shermanvillagetour;

/**
 * Created by Hendercine on 7/6/16.
 */
import android.support.v7.app.AppCompatActivity;

public class Place extends AppCompatActivity {

    //TODO: Add private variable for venue map link
    //TODO: Add private variable for venue website link

    private int pVenueDescription;

    private int pVenueName;

    private int pImageResourceId;

    //TODO: Expand Place object to take five inputs instead of three

    public Place(int venueName, int venueDescription, int imageResourceId) {
        pVenueDescription = venueDescription;
        pVenueName = venueName;
        pImageResourceId = imageResourceId;
    }

    /**
     * Get the venue url of the place
     */
    public int getVenueDescription() {
        return pVenueDescription;
    }

    /**
     * Get the venue name of the place
     */
    public int getVenueName() {
        return pVenueName;
    }

    /**
     * Get the resource ID of the associated drawable
     */
    public int getImageResourceId() {
        return pImageResourceId;
    }

    //TODO: Add method to get the venue map link
    //TODO: Add method to get the venue website link

    /**
     * Returns the string representation of the {@link Place} object.
     */
    @Override
    public String toString() {
        return "Place{" +
                "pVenueDescription='" + pVenueDescription + '\'' +
                ", pVenueName='" + pVenueName + '\'' +
                ", pImageResourceId=" + pImageResourceId +
                '}';
    }

}
