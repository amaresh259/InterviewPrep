package org.example.oops;

public class MethodOverloading {
    void add(int a, long b){
        System.out.println("Addition of two parameter int long");
    }
    void add(long a, long b){
        System.out.println("Addition of two parameter long long");
    }

    void add(int a, double b){
        System.out.println("Addition of two parameter int double");
    }
    void add(float a, double b){
        System.out.println("Addition of two parameter int "+a+" double "+b);
    }

    long add(float a, long b){
        System.out.println("Addition of two parameter int long");
        int c = 1;
        return c;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        //mo.add(20,20); Due to type promotion it will give C.T error
        mo.add(20, 20L);
        mo.add(20L, 20L);
        mo.add(20L, 20);
        mo.add(20, 20);

        byte b = 20;
        mo.add(b, 20f); // 11
        mo.add('a', 20d);
    }
}
