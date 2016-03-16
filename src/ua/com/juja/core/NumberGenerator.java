package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class NumberGenerator {
    private int min;
    private int max;

    public NumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getNumber(){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

}
