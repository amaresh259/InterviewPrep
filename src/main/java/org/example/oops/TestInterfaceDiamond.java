package org.example.oops;

public interface TestInterfaceDiamond {

    static void m1(){
        int x = 5;
        x++;
        System.out.println("m1 x value = "+x);
    }
    static void m2(){

    }
    static String m1(int x){
        return "x";
    }

    default void m3(){
        int y=5;
        y++;
        System.out.println("Inside TestDiamond");
        System.out.println("m3 for TestDiamond y value = "+y);
    }
}
