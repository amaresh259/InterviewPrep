package org.example;

@FunctionalInterface
public interface TestFunctionalInterface extends TestInterface{
    void m1();
    static void m2(){

    }
    default void m3(){
        System.out.println("Functional Interface");
    }
}
