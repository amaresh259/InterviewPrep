package org.example;

public abstract class Test {
    int x = 4;
    int y = 5;
    abstract void m1(); // If abstract keyword is missing, then giving compile time error
    void m2(){
        System.out.println();
    }

    Test(){

    }
    Test(int x, int y){
        this.x= x;
        this.y = y;
        System.out.println("Checks "+x +" "+y);
    }

}
