package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Destination {
    private String destination;

    @Override
    public String toString() {
        return destination;
    }

    public Destination(String destination) {
        this.destination = destination;
    }
}
