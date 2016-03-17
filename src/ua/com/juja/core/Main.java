package ua.com.juja.core;

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

        airline.addAircraft("Boeing 737", 138 , 20);
        airline.addAircraft("Boeing 737", 138 , 20);
        airline.addAircraft("Airbus A310", 248 , 31);
        airline.addAircraft("Airbus A310", 248 , 31);
        airline.addAircraft("Boeing 787-8", 242 , 75);
        airline.addAircraft("Boeing 787-8", 242 , 75);
        airline.addAircraft("Comac ARJ21", 105);
        airline.addAircraft("Comac ARJ21", 105);
        airline.addAircraft("Airbus A340-600", 380 , 60);
        airline.addAircraft("Airbus A340-600", 380 , 60);

        airline.setAircraftToDistination(airline.getAllFlight()[0],airline.getAircrafts()[2]);
        airline.setAircraftToDistination(airline.getAllFlight()[1],airline.getAircrafts()[0]);

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
