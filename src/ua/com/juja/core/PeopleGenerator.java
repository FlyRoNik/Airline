package ua.com.juja.core;


import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class PeopleGenerator {
    private Destination destination;
    private int numberofpeople;
    private People[] people;

    public PeopleGenerator(int numberofpeople, Destination destination) {
        this.numberofpeople = numberofpeople;
        this.destination = destination;
        this.people = new People[numberofpeople];

        NumberGenerator cHGen = new NumberGenerator(65,90);
        NumberGenerator chGen = new NumberGenerator(97,122);

        for (int i = 0; i < numberofpeople; i++) {
            String fio = String.valueOf((char) cHGen.getNumber());

            for (int j = 1; j < 9; j++) {
                fio = fio + String.valueOf((char) chGen.getNumber());
            }
            this.people[i] = new People(fio, destination.toString());
            System.out.println(people[i].toString());
        }
    }

    public People[] getPeople(){
        People[] peoples = new People[this.people.length];
        for (int i = 0; i < this.people.length; i++) {
            peoples[i] = new People(this.people[i].getFio(),this.people[i].getDestination());
        }
        return peoples;
    }

    public int getNumberofpeople(){
        return numberofpeople;
    }
}
