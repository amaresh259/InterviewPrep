package org.example.oops;

public abstract class TestAbstract {
    int x;
    String s1;

    TestAbstract(){

    }
    TestAbstract(int x, String s1){
        this.x = x;
        this.s1 = s1;
    }
    String m1(){
        System.out.println("Abstact");
        return "Ram";
    }

    static void m2(){

    }

}
