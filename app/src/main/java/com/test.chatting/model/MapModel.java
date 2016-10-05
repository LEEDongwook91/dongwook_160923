package com.test.chatting.model;

/**
 * Created by Dongwook LEE on 24/09/2016.
 */
public class MapModel {
    private String latitude;
    private String longitude;

    public MapModel() {
    }

    public MapModel(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
