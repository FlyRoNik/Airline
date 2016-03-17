package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Aircraft {
    private String name;
    private int capacityBusiness;
    private int capacityEconomy;


    public Aircraft(String name, int capacityEconomy) {
        this.name = name;
        this.capacityEconomy = capacityEconomy;
        this.capacityBusiness = 0;
    }

    public Aircraft(String name, int capacityEconomy, int capacityBusiness) {
        this.name = name;
        this.capacityEconomy = capacityEconomy;
        this.capacityBusiness = capacityBusiness;
    }

    @Override
    public String toString() {
        if (capacityBusiness != 0) {
            return name + "(" + capacityEconomy + ", " + capacityBusiness + ")" + "\n";
        } else {
            return name + "(" + capacityEconomy + ")" + "\n";
        }
    }

    public String getName() {
        return name;
    }

    public int getCapacityBusiness() {
        return capacityBusiness;
    }

    public int getCapacityEconomy() {
        return capacityEconomy;
    }
}
