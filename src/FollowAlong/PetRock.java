package FollowAlong;

public class PetRock {
    private String name;
    private double weight;
    private Location location;

    PetRock(String name, double weight, Location location){
        this.name = name;
        this.weight=weight;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Location getLocation() {
        return location;
    }

    public String toString(){
        return "Rock{" +
                "name='" +name + '\'' +
                ", weights=" + weight +
                ", location=" + location +
                '}';
    }
}
