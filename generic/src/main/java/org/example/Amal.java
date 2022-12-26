package org.example;

public class Amal<T extends C> {

    public T t;

    public Amal() {
    }

    public Amal(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
