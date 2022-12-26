package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(powerOf(5, 3));
    }

    public static int powerOf(int number, int times) {
        if (times == 0) return 1;
        else {
            return number * powerOf(number, times - 1);
        }
    }
}