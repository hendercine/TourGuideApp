package com.example.android.shermanvillagetour;

/**
 * Created by Hendercine on 7/6/16.
 */
import android.support.v7.app.AppCompatActivity;

public class Place extends AppCompatActivity {


    private String pVenueUrl;

    private String pVenueName;

    private int pImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Place(String venueUrl, String venueName, int imageResourceId) {
        pVenueUrl = venueUrl;
        pVenueName = venueName;
        pImageResourceId = imageResourceId;
    }

    /**
     * Get the venue url of the place
     */
    public String getVenueUrl() {
        return pVenueUrl;
    }

    /**
     * Get the venue name of the place
     */
    public String getVenueName() {
        return pVenueName;
    }

    /**
     * Get the resource ID of the associated drawable
     */
    public int getImageResourceId() {
        return pImageResourceId;
    }

    public boolean hasImage() {
        return pImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link Place} object.
     */
    @Override
    public String toString() {
        return "Place{" +
                "pVenueUrl='" + pVenueUrl + '\'' +
                ", pVenueName='" + pVenueName + '\'' +
                ", pImageResourceId=" + pImageResourceId +
                '}';
    }
}
