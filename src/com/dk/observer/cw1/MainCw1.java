package com.dk.observer.cw1;

public class MainCw1 {
    public static void main(String[] args) {
        PolishTimeSubject czasPolszy = new PolishTimeSubject();
        new TokyoObserver(czasPolszy);
        new KairObserver(czasPolszy);

        czasPolszy.set(1537);
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
        czasPolszy.set(2437);
    }
}
