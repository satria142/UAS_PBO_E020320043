package id.ac.poliban.mi.vb.e020320043.wisataappe020320043.model;

import com.google.android.gms.maps.model.LatLng;

public class ModelMapLocation {

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}