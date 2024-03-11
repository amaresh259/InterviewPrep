package org.example.oops;

public class Vehicle {

    String vehicleNo;
    String model;
    static String chassisNo = "xyz";
    String color;

    Vehicle(){
        System.out.println("Vehicle Class Constructor");
    }
    Vehicle(String vehicleNo, String model, String chassisNo, String color){
        this.vehicleNo = vehicleNo;
        this.model = model;
        //this.chassisNo = chassisNo;
        this.color = color;
    }

    public void start(){
        System.out.println("Inside Vehicle Class");
    }
}
