package com.generic_max_number;

public class MaxNumber<T extends  Comparable> {
    T[] numbers;

    public MaxNumber(T... numbers) {
        this.numbers = numbers;
    }

    public T findMaxNumber(){
        return findMaxNumber(this.numbers);
    }

    private static <T extends  Comparable> T findMaxNumber(T... numbers) {
        T maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if ( maxNumber.compareTo(numbers[i]) < 0 )
                maxNumber = numbers[i];
        }

        toPrintValues(maxNumber);
        return maxNumber;
    }

    private static <T extends Comparable> void toPrintValues(T maxNumber) {
        System.out.println("Maximum values : "+maxNumber);
    }

}
