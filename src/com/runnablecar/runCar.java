package com.runnablecar;

public class runCar {
    public static void main(String args[])
    {
        runableCar r1=new runableCar("Maruti");
        runableCar r2=new runableCar("jaguar");
        runableCar r3=new runableCar("nano");
        runableCar r4=new runableCar("Nexon");

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        Thread t4=new Thread(r4);
        System.out.println("Thread T1,T2,T3 and T4 starting");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            Thread.sleep(9);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}
