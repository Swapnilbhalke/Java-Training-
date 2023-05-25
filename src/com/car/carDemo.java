package com.car;

public class carDemo {

    public static void main(String args[]) throws InterruptedException {

        Car t1 = new Car("Audi");
        Car t2 = new Car("Rolls Royce");
        Car t3 = new Car("BMW");
        Car t4 = new Car("BenZ");
        System.out.println("Starting Thread "+t1.getName()+","+t2.getName()+","+t3.getName()+" and "+t4.getName());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(9);

    }
}
