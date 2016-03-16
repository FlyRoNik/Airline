package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline(10,   "ÁÎĞÈÑÏÎËÜ - ÀËÌÀÒÛ",
                "ÁÎĞÈÑÏÎËÜ - ÀÌÑÒÅĞÄÀÌ",    "ÁÎĞÈÑÏÎËÜ - ÀÑÒÀÍÀ",
                "ÁÎĞÈÑÏÎËÜ - ÂÅÍÀ",         "ÁÎĞÈÑÏÎËÜ - ÌÀÄĞÈÄ",
                "ÁÎĞÈÑÏÎËÜ - ÌÎÑÊÂÀ",       "ÁÎĞÈÑÏÎËÜ - ÏÀĞÈÆ");


        PeopleGenerator peopleGen1 = new PeopleGenerator(100,airline.getAllFlight()[0]);
        PeopleGenerator peopleGen2 = new PeopleGenerator(78,airline.getAllFlight()[1]);

        //TODO add Passenger

        airline.emplanement();
    }
}
