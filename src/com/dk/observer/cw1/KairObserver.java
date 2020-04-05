package com.dk.observer.cw1;

public class KairObserver implements Observer {
    private Subject subject;

    public KairObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        int polishTime = subject.get();
        int kairTime = polishTime + 100;
        if (kairTime > 2459){
            kairTime = kairTime % 2400;
        }
        System.out.println("czas w kairze to: " + kairTime);

    }
}
