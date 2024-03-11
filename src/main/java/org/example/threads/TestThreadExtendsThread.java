package org.example.threads;

public class TestThreadExtendsThread extends Thread{
    public void run(){
        System.out.println("run "+Thread.currentThread().getName());
        //m1();
    }
    public void m1(){
        System.out.println("m1 "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        TestThreadExtendsThread t1 = new TestThreadExtendsThread();
        t1.start();
        t1.m1();
        System.out.println("Main method "+Thread.currentThread().getName());
    }
}
