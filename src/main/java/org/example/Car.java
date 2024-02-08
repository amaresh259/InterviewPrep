package org.example;

public class Car extends Vehicle{

    public void start(){
        System.out.println("Inside Car Class");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Vehicle v1 = new Vehicle();
        v1.start();
        Vehicle v2 = new Car();
        v2.start();
    }
}
