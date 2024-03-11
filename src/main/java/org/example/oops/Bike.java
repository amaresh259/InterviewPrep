package org.example.oops;

public class Bike extends Vehicle{
    String typeOfBreak;

    Bike(){
        this("123", "ghj", "ahhh1", "Red", "Disc");
        System.out.println("Bike Class Constructor");
    }

    Bike(String vehicleNo, String model, String chassisNo, String color, String typeOfBreak){
        super(vehicleNo, model, chassisNo, color);
        this.typeOfBreak = typeOfBreak;
    }


    void print(){
        //super.chassisNo = "Chassis123";
        super.start();
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.print();
    }

}
