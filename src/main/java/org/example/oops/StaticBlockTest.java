package org.example.oops;

public class StaticBlockTest {
    static int x;

    static {
        x = 5;
    }

    int y;
    {
        y = 5;
    }
    StaticBlockTest(){

    }
    public void m1(){

    }


    public static void main(String[] args) {
        StaticBlockTest s = new StaticBlockTest();
        System.out.println("x = "+x);
        System.out.println("y = "+s.y);
        s.m1();
    }
}
