package ua.com.juja.core;

import ua.com.juja.core.People.People;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Passenger {

    private int FREQUENTFLYERNUMBER;
    private People people;


    public Passenger(int frequentFlyerNumber, People people) {
        this.FREQUENTFLYERNUMBER = frequentFlyerNumber;
        this.people = people;
    }


}
