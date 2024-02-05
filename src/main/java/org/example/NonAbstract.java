package org.example;

public class NonAbstract extends TestAbstract{
    String m1(){
        super.m1();
        System.out.println("Child");
        return "Shyam";
    }
    public static void main(String[] args) {
        TestAbstract testAbstract = new NonAbstract();
        testAbstract.m1();
    }
}
