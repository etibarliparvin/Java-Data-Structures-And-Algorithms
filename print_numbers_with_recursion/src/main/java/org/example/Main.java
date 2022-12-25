package org.example;

public class Main {
    public static void main(String[] args) {
        printNumbers(3);
        System.out.println("----------------------------");
        printNumbersReverse(3);
    }

    public static void printNumbers(int n) {
        if (n < 0) {
            return;
        } else {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static void printNumbersReverse(int n) {
        if (n < 0) {
            return;
        } else {
            System.out.println(n);
            printNumbersReverse(n - 1);
        }
    }
}