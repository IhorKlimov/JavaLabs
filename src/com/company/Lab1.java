package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Варіант 1
 * */
public class Lab1 {
    public static void main(String[] args) {
        String[] input = new String[]{
                "Hey", "Definitely", "Ok", "Alright", "Nice", "Absolutely", "Beautiful", "Strange", "Excellent",
                "Portrait", "Keyboard", "Still"
        };

        String[] largerThanAverage = findStrings(input, true);
        System.out.println("Found strings, longer than average: " + Arrays.toString(largerThanAverage));

        String[] smallerThanAverage = findStrings(input, false);
        System.out.println("Found strings, shorter than average: " + Arrays.toString(smallerThanAverage));
    }

    private static String[] findStrings(String[] input, boolean largerThanAverage) {
        int totalLength = 0;

        for (String s : input) {
            totalLength += s.length();
        }

        int averageStringLength = totalLength / input.length;

        ArrayList<String> output = new ArrayList<>();

        for (String s : input) {
            if (largerThanAverage && s.length() > averageStringLength) {
                output.add(s);
            } else if (!largerThanAverage && s.length() < averageStringLength) {
                output.add(s);
            }
        }

        String[] resultArray = new String[output.size()];
        return output.toArray(resultArray);
    }
}
