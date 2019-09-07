package com.draculatech.gojobs;

public class PointOfInterest {
    public String name = "";
    public double latitude = 0.0;
    public double longitude = 0.0;

    public PointOfInterest(String name, Double latitude, Double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
