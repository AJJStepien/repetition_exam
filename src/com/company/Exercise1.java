package com.company;

import java.util.Random;

import static java.lang.String.valueOf;

public class Exercise1 {
    private char[] signs = {'@','#','$','%','&','*','+'};
    public void drawLineWithSeparatedNChars(char sign, int size, char sep) {
        String line = "";
        for (int x = 0; x < size; x++) {
            if (x == size - 1) {
                line = line + (sign);
                break;
            }
            line = line + (valueOf(sign) + sep);
        }
        System.out.println(line);
    }
    public void drawLineWithSeparatedRandomNChars(int size, char sep) {
        Random random = new Random();
        String line = "";
        for (int x = 0; x < size; x++) {
            if (x == size - 1) {
                line = line + (signs[random.nextInt(signs.length)]);
                break;
            }
            line = line + (String.valueOf(signs[random.nextInt(signs.length)]) + sep);
        }
        System.out.println(line);
    }

    public void drawLineWithSeparatorsInside(char sign, int size, char sep) {
        String line = valueOf(sign);
        for (int x = 0; x < size - 2; x++) {
            line = line + sep;
        }
        line = line + sign;
        System.out.println(line);
    }

    public void drawLineWithSeparatorsInsideAndWithOneSignInside(char sign, int size, char sep, int position) {
        String line = valueOf(sign);
        for (int x = 0; x < size - 2; x++) {
            if (x == position - 2) {
                line = line + sign;
            } else {
                line = line + sep;
            }
        }
        line = line + sign;
        System.out.println(line);
    }

    public void drawLineWithSeparatorsInsideAndWithOneRandomSignInside(int size, char sep, int position) {
        Random random = new Random();
        String line = valueOf(signs[random.nextInt(signs.length)]);
        for (int x = 0; x < size - 2; x++) {
            if (x == position - 2) {
                line = line + signs[random.nextInt(signs.length)];
            } else {
                line = line + sep;
            }
        }
        line = line + signs[random.nextInt(signs.length)];
        System.out.println(line);
    }

    public void drawLineWithSeparatorsInsideAndWithTwoSignsInside(char sign, int size, char sep, int pos1, int pos2) {
        String line = valueOf(sign);
        for (int x = 0; x < size - 2; x++) {
            if (x == pos1 - 2) {
                line = line + sign;
            } else if (x == pos2 - 2) {
                line = line + sign;
            } else {
                line = line + sep;
            }
        }
        line = line + sign;
        System.out.println(line);
    }

    public void drawLineWithSeparatorsInsideAndWithTwoRandomSignsInside(int size, char sep, int pos1, int pos2) {
        Random random = new Random();
        String line = valueOf(signs[random.nextInt(signs.length)]);
        for (int x = 0; x < size - 2; x++) {
            if (x == pos1 - 2) {
                line = line + signs[random.nextInt(signs.length)];
            } else if (x == pos2 - 2) {
                line = line + signs[random.nextInt(signs.length)];
            } else {
                line = line + sep;
            }
        }
        line = line + signs[random.nextInt(signs.length)];
        System.out.println(line);
    }

    public void drawSquare(char sign, int size, char sep) {
        drawLineWithSeparatedNChars(sign, size, sep);
        for (int x = 0; x < size - 2; x++) {
            drawLineWithSeparatorsInside(sign, (size * 2 - 1), sep);
        }
        drawLineWithSeparatedNChars(sign, size, sep);
    }

    public void drawSquareWithDiagonal(char sign, int size, char sep) {
        drawLineWithSeparatedNChars(sign, size, sep);
        int oddNum = 1;
        for (int x = 0; x < size - 2; x++) {
            drawLineWithSeparatorsInsideAndWithOneSignInside(sign, size * 2 - 1, sep, ++oddNum * 2 - 1);
        }
        drawLineWithSeparatedNChars(sign, size, sep);
    }

    public void drawSquareWithDiagonals(char sign, int size, char sep) {
        drawLineWithSeparatedNChars(sign,size, sep);
        int oddNum = 1;
        int lastPos = size;
        for (int x = 0; x < size - 2; x++) {
            if ((size % 2 != 0) && (x == size)){
                drawLineWithSeparatorsInsideAndWithOneSignInside(sign, size * 2 - 1, sep, ++oddNum * 2 - 1);
                lastPos--;
            }
            else if ((size % 2 == 0) && (x == size)) {
                lastPos--;
                oddNum++;
            } else {
                drawLineWithSeparatorsInsideAndWithTwoSignsInside(sign, size * 2 - 1, sep, ++oddNum * 2 - 1, --lastPos * 2 - 1);
            }
        }
        drawLineWithSeparatedNChars(sign, size, sep);
    }
    public void drawSquareWithDiagonalsRandomSigns(int size){
        char sep = ' ';
        drawLineWithSeparatedRandomNChars(size, sep);
        int oddNum = 1;
        int lastPos = size;
        for (int x = 0; x < size - 2; x++) {
            if ((size % 2 != 0) && (x == size)){
                drawLineWithSeparatorsInsideAndWithOneRandomSignInside(size * 2 - 1, sep, ++oddNum * 2 - 1);
                lastPos--;
            }
            else if ((size % 2 == 0) && (x == size)) {
                lastPos--;
                oddNum++;
            } else {
                drawLineWithSeparatorsInsideAndWithTwoRandomSignsInside(size * 2 - 1, sep, ++oddNum * 2 - 1, --lastPos * 2 - 1);
            }
        }
        drawLineWithSeparatedRandomNChars(size, sep);
    }
}
