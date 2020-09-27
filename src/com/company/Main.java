package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        Exercise1 e = new Exercise1();
//        e.drawLineWithSeparatedNChars('#', 5, '_');
//        e.drawLineWithSeparatorsInside('#', 10, '_');
//        System.out.println();
//        e.drawSquare('#', 7, '_');
//        e.drawLineWithSeparatorsInsideAndWithOneSignInside('#', 7, '_', 3);
//        System.out.println();
//        e.drawSquareWithDiagonal('#', 5, '_');
//        System.out.println();
//        e.drawSquareWithDiagonals('#', 7, ' ');
//        e.drawLineWithSeparatedRandomNChars(5, ' ');
//        System.out.println();
//        e.drawSquareWithDiagonalsRandomSigns(5);
        Exercise2 e2 = new Exercise2();
        System.out.println(e2.power(5,6));
        e2.printMyTrueBDay(LocalDate.of(1993, 10, 3));
        e2.calculateAvgInRows();
        System.out.println();
        e2.calcuateAvg();
    }
}
