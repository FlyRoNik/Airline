package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline(10);

        airline.addDestination("ÁÎĞÈÑÏÎËÜ - ÀËÌÀÒÛ",2);
        airline.addDestination("ÁÎĞÈÑÏÎËÜ - ÀÌÑÒÅĞÄÀÌ",2);
        airline.addDestination("ÁÎĞÈÑÏÎËÜ - ÀÑÒÀÍÀ",2);
        airline.addDestination("ÁÎĞÈÑÏÎËÜ - ÂÅÍÀ",1);
        airline.addDestination("ÁÎĞÈÑÏÎËÜ - ÌÀÄĞÈÄ",2);
        airline.addDestination("ÁÎĞÈÑÏÎËÜ - ÏÀĞÈÆ",2);
        airline.addDestination("ÁÎĞÈÑÏÎËÜ - ÌÎÑÊÂÀ",2);

        //TODO Îäèí ìàññèâ ñ ëşäüìè íà ğàçíûå íàïğàâëåíèÿ
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
