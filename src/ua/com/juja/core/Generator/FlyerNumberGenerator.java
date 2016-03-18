package ua.com.juja.core.Generator;

/**
 * Created by FlyRoNik on 15.03.2016.
 */
public class FlyerNumberGenerator {
    private int current;

    public FlyerNumberGenerator(int current) {
        this.current = current;
    }

    public int getNext() {
        int result = current;
        current++;
        return result;
    }
}
