package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Aircraft {
    private String name;
    private int capacity;
    private Destination destination;


    public Aircraft(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return name + "(" + capacity + ")" + "\n";
    }
}
