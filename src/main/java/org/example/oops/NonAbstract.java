package org.example.oops;

public class NonAbstract extends TestAbstract{

    int y;
    NonAbstract(){
        this.y = 1;
    }
    NonAbstract(int x, int y, String s1){
        //this();   //Should not have both this() and super() at a time in constructor.
        super(5,"Ram");

    }

    static void m2(){

    }
    String m1(){
        //this();   //Should not have this() and super() in any static / non-static method
        super.m1();
        System.out.println("Child Class x = "+x+" s1 ="+s1);
        return "Shyam";
    }
    public static void main(String[] args) {
        TestAbstract testAbstract = new NonAbstract();
        testAbstract.m1();
    }
}
