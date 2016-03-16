package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Airline {

    private Destination[] destination;
    private Aircraft[] aircrafts;
    private Cashbox[] cashboxes;


    public Airline(int flightNumber) {
        aircrafts = new Aircraft[flightNumber];

        for (int index = 0; index < flightNumber; index++) {
            aircrafts[index] = new Aircraft();
        }
    }

    public Destination[] getAllFlight(){
        Destination[] destinations = new Destination[this.destination.length];
        for (int i = 0; i < this.destination.length; i++) {
            destinations[i] = new Destination(this.destination[i].toString(),
                    this.destination[i].getNumberOfAircraft());
        }
        return destinations;
    }

    public void addPassenger(People people){
        for (Cashbox cashboxe : cashboxes) {
            if (cashboxe.getDestination().toString() == people.getDestination()) {
                cashboxe.addPassenger(people);
            }
        }
    }

    public void addDestination(String destinations, int numberOfAircraft) {
        Destination dest = new Destination(destinations, numberOfAircraft);
        addToArray(destination, dest);
        addToArray(cashboxes, new Cashbox(dest, destination.length * 1000));
    }

    private Destination[] addToArray(Destination[] array, Destination s) {
        Destination[] ans = new Destination[array.length + 1];
        System.arraycopy(array, 0, ans, 0, array.length);
        ans[ans.length - 1] = s;
        return ans;
    }

    private Cashbox[] addToArray(Cashbox[] array, Cashbox s) {
        Cashbox[] ans = new Cashbox[array.length + 1];
        System.arraycopy(array, 0, ans, 0, array.length);
        ans[ans.length - 1] = s;
        return ans;
    }
}
