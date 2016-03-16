package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Destination {
    private String destination;
    private int numberOfAircraft;

    @Override
    public String toString() {
        return destination;
    }

    public Destination(String destination, int numberOfAircraft) {
        this.destination = destination;
        this.numberOfAircraft = numberOfAircraft;
    }

    public int getNumberOfAircraft() {
        return numberOfAircraft;
    }
}
