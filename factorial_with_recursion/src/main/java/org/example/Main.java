package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(5));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        else {
            return n * factorial(n - 1);
        }
    }

    public static int factorial2(int n) {
        return n == 0 ? 1 : n * factorial2(n - 1);
    }
}