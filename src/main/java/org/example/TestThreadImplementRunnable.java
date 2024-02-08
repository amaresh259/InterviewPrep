package org.example;

public class TestThreadImplementRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        TestThreadImplementRunnable t1 = new TestThreadImplementRunnable();
        Thread thread = new Thread(t1);
        thread.start();
    }
}
