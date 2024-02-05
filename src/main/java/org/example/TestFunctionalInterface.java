package org.example;

@FunctionalInterface
public interface TestFunctionalInterface {
    void m1();
    static void m2(){

    }
    static void m3(){
        System.out.println("Functional Interface");
    }
}
