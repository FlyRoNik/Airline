package ua.com.juja.core.Generator;


import ua.com.juja.core.Destination;
import ua.com.juja.core.People.People;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class PeopleGenerator {
    private int numberOfPeople;
    private People[] people;

    public PeopleGenerator(int numberOfPeople, Destination destination) {
        this.numberOfPeople = numberOfPeople;
        this.people = new People[numberOfPeople];

        NumberGenerator cHGen = new NumberGenerator(65,90);
        NumberGenerator chGen = new NumberGenerator(97,122);

        System.out.println("\n" + destination.toString());
        for (int i = 0; i < numberOfPeople; i++) {
            String fio = String.valueOf((char) cHGen.getNumber());

            for (int j = 1; j < 5; j++) {
                fio = fio + String.valueOf((char) chGen.getNumber());
            }

            fio = fio + ' ' + String.valueOf((char) cHGen.getNumber());

            for (int j = 1; j < 5; j++) {
                fio = fio + String.valueOf((char) chGen.getNumber());
            }
            this.people[i] = new People(fio, destination.toString());
            System.out.println(i + 1 + ")" + people[i].getFio());
        }
    }

    public People[] getPeople(){
        People[] peoples = new People[this.people.length];
        for (int i = 0; i < this.people.length; i++) {
            peoples[i] = new People(this.people[i].getFio(),this.people[i].getDestination());
        }
        return peoples;
    }

    public int getNumberOfPeople(){
        return numberOfPeople;
    }
}
