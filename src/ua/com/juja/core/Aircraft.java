package ua.com.juja.core;

import ua.com.juja.core.Place.PlaceService;
import ua.com.juja.core.Place.PlacePassenger;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Aircraft {
    private String name;
    private PlacePassenger[] placePassengers;
    private PlaceService[] placeServices;


    public Aircraft(String name, int capacityService, int capacity) {
        this.name = name;
        PlaceService[] placeServices = new PlaceService[capacityService];
        PlacePassenger[] placePassengers = new PlacePassenger[capacity];
    }

    @Override
    public String toString() {
        return name + "(" + placeServices.length + ", " + placePassengers.length + ")" + "\n";
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return placeServices.length;
    }

    public int getCapacityService(){
        return placeServices.length;
    }

    public void addPassenger(){

    }

    public boolean getFreePlace() {
        return true;
    }
}
