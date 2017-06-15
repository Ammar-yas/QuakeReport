package com.example.android.quakereport;

public class Earthquake {

    String url;
    double magnitude;
    String location;
    long timeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {

        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getUrl() {
        return url;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
