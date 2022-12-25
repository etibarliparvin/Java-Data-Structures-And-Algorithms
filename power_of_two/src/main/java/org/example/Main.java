package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(5));
    }

    public static int powerOfTwo(int n) {
        if (n == 0) return 1;
        else {
            int result = 2 * powerOfTwo(n - 1);
            return result;
        }
    }
}