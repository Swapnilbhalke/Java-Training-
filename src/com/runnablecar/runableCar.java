package com.runnablecar;

public class runableCar  implements Runnable{

    private String name;

    public runableCar(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for(int i=0;i<5;i++)
        {
            System.out.println("car " + name + " reached Destination " + i);
        }

    }
}
