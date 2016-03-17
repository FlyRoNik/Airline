package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Destination {
    private String destination;
    private Aircraft[] fleet;

    @Override
    public String toString() {
        return destination;
    }

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
}
