package org.example.oops;

public class Car extends Vehicle{

    String typeOfEngine;
    static String chassisNo = "abc";

    Car(){
       //super();  // automatically compiler add super() in subclass
        System.out.println("Car default Constructor");
    }

    Car(String typeOfEngine){
        super("123", "ghj", "ahhh1", "Red");
        //this();
        System.out.println("Inside Car single parameterized constructor");
    }
    /*Car(String vehicleNo, String model, String chassisNo, String color, String typeOfEngine){
        super(vehicleNo, model, chassisNo, color);
        this.typeOfEngine = typeOfEngine;
    }*/
    public void start(Car car){
        System.out.println("Inside Car Class"+car.typeOfEngine);
    }

    public static void main(String[] args) {
        Vehicle c1 = new Car("Petrol");
        //c1.chassisNo = "aadas";
        System.out.println(c1.chassisNo);
        Car c2 = new Car();
        c2.typeOfEngine = "xyz";
        c2.start(c2);
        c2.typeOfEngine ="rgh";
        //c1.start();
        /*Vehicle v1 = new Vehicle();
        v1.start();*/
        /*Vehicle v2 = new Car();
        v2.start();*/
    }
}
