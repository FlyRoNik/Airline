package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Airline {

    private Destination[] destination;
    private Aircraft[] aircrafts;
    private Cashbox[] cashboxes;


    public Airline(int flightNumber,String ... destination) {
        aircrafts = new Aircraft[flightNumber];

        for (int index = 0; index < flightNumber; index++) {
            aircrafts[index] = new Aircraft();
        }

        this.destination = new Destination[destination.length];
        this.cashboxes = new Cashbox[destination.length];

        for (int i = 0; i < destination.length; i++) {
            this.destination[i] = new Destination(destination[i]);
            this.cashboxes[i] = new Cashbox(this.destination[i],i*1000);
        }

    }

    public Destination[] getAllFlight(){
        Destination[] destinations = new Destination[this.destination.length];
        for (int i = 0; i < this.destination.length; i++) {
            destinations[i] = new Destination(this.destination[i].toString());
        }
        return destinations;
    }

    public void addPassenger(People people){
        for (int i = 0; i < cashboxes.length; i++) {
            if (cashboxes[i].getDestination() == people.getDestination()) {
                cashboxes[i].addPassenger(people);
            }
        }
    }

    public static void emplanement() {

    }
}
