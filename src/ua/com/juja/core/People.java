package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class People {

    private String FIO;
    private String destination;


    public People(String fio, String destination) {
        FIO = fio;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public String getFio(){
        return FIO.toString();
    }


}
