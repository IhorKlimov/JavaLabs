package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab7 {
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

        List<String> output = Arrays.stream(input).filter(s -> {
            if (largerThanAverage) {
                return s.length() > averageStringLength;
            } else {
                return s.length() < averageStringLength;
            }
        }).collect(Collectors.toList());

        String[] resultArray = new String[output.size()];
        return output.toArray(resultArray);
    }
}
