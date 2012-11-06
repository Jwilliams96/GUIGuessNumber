package root;

import java.util.Random;

/**
 *
 * @author Jwilliams96
 */
public class NumberManager {

    private int correctNumber;

    public NumberManager() {
        Random newRandomNumber = new Random(System.nanoTime());
        this.correctNumber = newRandomNumber.nextInt(10) + 1;
    }

    public NumberValues checkValue(int value) {
        try {
            if (value > correctNumber) {
                return NumberValues.tooHigh;
            } else if (value == correctNumber) {
                return NumberValues.correctValue;
            }else if (value > 10 || value < 0){
                throw new IllegalArgumentException();
            } else {
                return NumberValues.tooLow;
            } 
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }
}
