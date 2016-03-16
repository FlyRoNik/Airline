package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline(10);

        airline.addDestination("BORYSPIL - ALMATY",2);
        airline.addDestination("BORYSPIL - AMSTERDAM",2);
        airline.addDestination("BORYSPIL - ASTANA",2);
        airline.addDestination("BORYSPIL - VEIN",1);
        airline.addDestination("BORYSPIL - MADRID",2);
        airline.addDestination("BORYSPIL - PARIS",2);
        airline.addDestination("BORYSPIL - MOSCOW",2);

        //TODO Один массив с людьми на разные направления
        PeopleGenerator peopleGen1 = new PeopleGenerator(100,airline.getAllFlight()[0]);
        PeopleGenerator peopleGen2 = new PeopleGenerator(78,airline.getAllFlight()[1]);

        People[] waybill = peopleGen1.getPeople();
        for (People aWaybill : waybill) {
            airline.addPassenger(aWaybill);
        }

        waybill = peopleGen2.getPeople();
        for (People aWaybill : waybill) {
            airline.addPassenger(aWaybill);
        }

    }
}
