package com.company;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise2 {
    public int power(int x, int y) {
        int result = 1;
        if (y == 0) {
            return result;
        } else {
            for (int i = 0; i < y; i++) {
                result = result * x;
            }
        }
        return result;
    }

    public void printMyTrueBDay(LocalDate bDate) {
        LocalDate now = LocalDate.now();
        int dayOfBirth = bDate.getDayOfWeek().getValue();
        for (int year = now.getYear(); year >= bDate.getYear(); year--) {
            LocalDate current = LocalDate.of(year, bDate.getMonth(), bDate.getDayOfMonth());
            if (dayOfBirth == current.getDayOfWeek().getValue()) {
                System.out.println(current.getDayOfWeek() + " " + current.getYear());
            }
        }
    }

    double[][] numbers = {
            {3.14, 2, 4, 2.22, 1},
            {4, 1.2, 1.4, 0, 1},
            {3.14, 222, 1.4, -11, 0.12},
            {3.14, 2, 4, 2.22, 1},
            {5, 2, 5, 1, 2, 5, 6, 7}
    };

    public void calculateAvgInRows() {
        Arrays.stream(numbers).forEach(numInRow -> System.out.println(Arrays.stream(numInRow)
                        .average()
                        .getAsDouble()
                )
        );
    }

    public void calcuateAvg() {
        double sumOfAvg = Arrays.stream(numbers)
                .mapToDouble(numInRow -> Arrays.stream(numInRow)
                        .average()
                        .getAsDouble())
                .sum();
        System.out.println("Global AVG:" + sumOfAvg / numbers.length);
    }

    public void getGroupArrayByValues() {
        List<Double> numbersVector = new ArrayList<>();
        Arrays.stream(numbers)
                .forEach(numbersInRow -> Arrays
                        .stream(numbersInRow)
                        .forEach(number -> numbersVector.add(number))
                );
        Map<Double, List<Double>> groups = numbersVector.stream().collect(Collectors.groupingBy(Double::doubleValue));
                groups.keySet()
                .stream()
                .forEach(key -> System.out.println(key + " " + groups.get(key).size() ));
    }
}
