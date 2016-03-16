package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class People {

    private String FIO;
    private Destination destination;


    public People(String fio, Destination destination) {
        FIO = fio;
        this.destination = destination;
    }

    public Destination getDestination(){
        return new Destination(this.destination.toString());
    }
}
