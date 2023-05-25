package com.car;

public class Car extends Thread {

    public Car(String name) {
        setName(name);
    }


    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {

                System.out.println("car " + getName() + " reached Destination " + i);
            }

        }
    }

