package org.example.oops;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface TestInterface {
    int x = 4;

    //void abstractm1();

    static void m1(){
        int x = 0;
        x++;
        System.out.println("m1 x value = "+x);
    }
    static void m2(){

    }
    static String m1(int x){
        return "x";
    }

    default double squareRoot(int a) {
        return a*a*a;
    }

    default void m3(){
        int y=0;
        y++;
        System.out.println("Inside TestInterface");
        System.out.println("m3 y value = "+y);
    }

    //int operate(int a, int b);


    
}
