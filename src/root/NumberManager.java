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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.correctNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NumberManager other = (NumberManager) obj;
        if (this.correctNumber != other.correctNumber) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "The correct number is:" + correctNumber;
    }
    
    
}
