package com.dk.observer.cw1;

public interface Subject {

    void addObserver(Observer observer);
    void delObserver(Observer observer);
    void announce();
    int get();
    void set(int val);
}
