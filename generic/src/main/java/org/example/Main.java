package org.example;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        Amal<C> amal = new Amal<>();
        amal.setT(b);
        C t = amal.getT();
    }
}