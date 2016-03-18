package ua.com.juja.core;

import ua.com.juja.core.People.People;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Airline {

    private Destination[] destination;

    private Aircraft[] aircrafts;

    private Cashbox[] cashboxes;

    public Airline() {
        aircrafts = new Aircraft[0];
        destination = new Destination[0];
        cashboxes = new Cashbox[0];
    }


    public Destination[] getAllFlight(){
        Destination[] destinations = new Destination[this.destination.length];
        for (int i = 0; i < this.destination.length; i++) {
            destinations[i] = new Destination(this.destination[i].getDestination());
        }
        return destinations;
    }

    public Aircraft[] getAircraft() {
        Aircraft[] aircraft = new Aircraft[this.aircrafts.length];
        for (int i = 0; i < this.aircrafts.length; i++) {
            aircraft[i] = new Aircraft(this.aircrafts[i].getName(),
                    this.aircrafts[i].getCapacityService(),
                    this.aircrafts[i].getCapacity());
        }
        return aircraft;
    }

    public void addPassenger(People people){
        getCashbooksToDestination(getDestinationToString(people.getDestination())).addPassenger(people);
    }

    public void addDestination(String destinations) {
        Destination dest = new Destination(destinations);
        destination = addToArray(destination, dest);
        cashboxes = addToArray(cashboxes, new Cashbox(dest, destination.length * 1000));
        System.out.println("Add " + destinations + "\n");
    }

    public void addAircraft(String name, int capacityService, int capacityEconomy) {
        Aircraft aircraft = new Aircraft(name, capacityService, capacityEconomy);
        aircrafts = addToArray(aircrafts, aircraft);
        System.out.println("Add " + aircraft.toString() + "\n");
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

    private Aircraft[] addToArray(Aircraft[] array, Aircraft s) {
        Aircraft[] ans = new Aircraft[array.length + 1];
        System.arraycopy(array, 0, ans, 0, array.length);
        ans[ans.length - 1] = s;
        return ans;
    }

    public void setAircraftToDestination(Destination destination, Aircraft aircraft) {
        destination.setFleet(aircraft);
        System.out.println("Set " + destination.toString());
    }

    public Cashbox getCashbooksToDestination(Destination destination) {
        for (Cashbox cashbox : cashboxes) {
            if (cashbox.getDestination().getDestination() == destination.getDestination()) {
                return cashbox;
            }
        }
        return null;
    }

    public Destination getDestinationToString(String s) {
        for (Destination d : destination) {
            if (d.getDestination() == s) {
                continue;
            }
            return d;
        }
        return null;
    }
}
