package com.dk.observer.cw1;

public class TokyoObserver implements Observer {
    private Subject subject;

    public TokyoObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        int polishTime = subject.get();
        int tokyoTime = polishTime + 700;
        if (tokyoTime > 2459){
            tokyoTime = tokyoTime % 2400;
        }
        System.out.println("czas w tokyo to: " + tokyoTime);

    }
}
