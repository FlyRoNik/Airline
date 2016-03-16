package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Cashbox {
    private Destination destinations;
    private FlyerNumberGenerator numberGen;
    private Passenger[] passengers;

    public Cashbox(Destination destinations, int baza) {
        this.destinations = destinations;
        this.numberGen = new FlyerNumberGenerator(baza);
        this.passengers = new Passenger[0];
    }

    public Destination getDestination() {
        return new Destination(this.destinations.toString(),this.destinations.getNumberOfAircraft());
    }

    public void addPassenger(People people) {
        addToArray(passengers, new Passenger(numberGen.getNext(), people));
    }

    private Passenger[] addToArray(Passenger[] array, Passenger s) {
        Passenger[] ans = new Passenger[array.length + 1];
        System.arraycopy(array, 0, ans, 0, array.length);
        ans[ans.length - 1] = s;
        return ans;
    }
}
