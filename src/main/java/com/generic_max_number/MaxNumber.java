package com.generic_max_number;

public class MaxNumber<T extends  Comparable> {
    T[] numbers;

    public MaxNumber(T... numbers) {
        this.numbers = numbers;
    }

    public T findMaxNumber(){
        return findMaxNumber(this.numbers);
    }

    private static <T extends  Comparable> T findMaxNumber(T... values) {
        T maxNumber = values[0];
        for (int i = 1; i < values.length; i++) {
            if ( maxNumber.compareTo(values[i]) < 0 )
                maxNumber = values[i];
        }
        return maxNumber;
    }

}
