package com.dk.observer.cw1;

import java.util.LinkedList;
import java.util.List;

public class PolishTimeSubject implements Subject {
    private List<Observer> observers = new LinkedList<>();
    private int polishTime;

    @Override
    public void addObserver(Observer observer) {
    observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
observers.remove(observer);
    }

    @Override
    public void announce() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public int get() {
        return polishTime;
    }

    @Override
    public void set(int val) {
        this.polishTime = val;
        System.out.println("polish time is: " + val);
        announce();
    }


}
