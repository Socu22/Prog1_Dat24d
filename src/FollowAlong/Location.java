package FollowAlong;

public class Location {
    private double latitude;
    private double longitude;

    Location(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public String toString(){
        return "Rock{" +
                "latitude='" +latitude + '\'' +
                ", longitude=" + longitude +
                '}';
    }
}
