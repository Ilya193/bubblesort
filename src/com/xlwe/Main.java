package com.xlwe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(1);
        numbers.add(-1);
        numbers.add(568);
        numbers.add(10);
        numbers.add(55);

        bubbleSort(numbers);
    }

    public static void bubbleSort(ArrayList<Integer> numbers) {
        boolean isSorted = false;
        int count = 0;

        while (!isSorted) {
            isSorted = true;

            for (int j = 1; j < numbers.size() - count; j++) {
                if (numbers.get(j) < numbers.get(j - 1)) {
                    Integer temp = numbers.get(j - 1);
                    numbers.set(j - 1, numbers.get(j));
                    numbers.set(j, temp);
                    isSorted = false;
                }
            }

            if (!isSorted)
                count++;
        }

        System.out.println(numbers);
    }
}
