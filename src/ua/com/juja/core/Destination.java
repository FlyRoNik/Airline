package ua.com.juja.core;

import java.util.Arrays;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Destination {
    private String destination;
    private Aircraft[] fleet;

    public Destination(String destination) {
        this.destination = destination;
        fleet = new Aircraft[0];
    }

    public void setFleet(Aircraft aircraft) {
        fleet = addToArray(fleet, aircraft);
    }

    public int getNumberOfAircraft() {
        return fleet.length;
    }

    private Aircraft[] addToArray(Aircraft[] array, Aircraft s) {
        Aircraft[] ans = new Aircraft[array.length + 1];
        System.arraycopy(array, 0, ans, 0, array.length);
        ans[ans.length - 1] = s;
        return ans;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        String s = destination + ":\n\t";
        for (Aircraft aircraft : fleet) {
            s = s + aircraft.toString() + "\t";
        }

        return s;
    }

    public boolean getFreePlace() {
        return true;
    }
}
