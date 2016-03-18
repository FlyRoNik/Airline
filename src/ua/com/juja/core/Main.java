package ua.com.juja.core;

import ua.com.juja.core.Generator.PeopleGenerator;
import ua.com.juja.core.People.People;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline();

        airline.addDestination("BORYSPIL - ALMATY");
        airline.addDestination("BORYSPIL - AMSTERDAM");
        airline.addDestination("BORYSPIL - ASTANA");
        airline.addDestination("BORYSPIL - VEIN");
        airline.addDestination("BORYSPIL - MADRID");
        airline.addDestination("BORYSPIL - PARIS");
        airline.addDestination("BORYSPIL - MOSCOW");

        airline.addAircraft("Boeing 737", 6, 152);
        airline.addAircraft("Boeing 737", 6, 152);
        airline.addAircraft("Airbus A310", 8, 271);
        airline.addAircraft("Airbus A310", 8, 271);
        airline.addAircraft("Boeing 787-8", 8, 311);
        airline.addAircraft("Boeing 787-8", 8, 311);
        airline.addAircraft("Comac ARJ21", 5, 100);
        airline.addAircraft("Comac ARJ21", 5, 105);
        airline.addAircraft("Airbus A340-600", 10, 430);
        airline.addAircraft("Airbus A340-600", 10, 430);

        airline.setAircraftToDestination(airline.getAllFlight()[0], airline.getAircraft()[2]);
        airline.setAircraftToDestination(airline.getAllFlight()[1], airline.getAircraft()[0]);

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
