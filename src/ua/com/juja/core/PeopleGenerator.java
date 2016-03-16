package ua.com.juja.core;

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

        NumberGenerator cHGen = new NumberGenerator(128,159);
        NumberGenerator chGen = new NumberGenerator(160,175);
        char[] fio = new char[10];
        fio[0] = (char) cHGen.getNumber();
        for (int i = 1; i < fio.length; i++) {
            fio[i] = (char) chGen.getNumber();
        }

        for (int i = 0; i < numberofpeople; i++) {
            this.people[i] = new People(Arrays.toString(fio), destination);
        }
    }


}
