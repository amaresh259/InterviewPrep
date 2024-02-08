package org.example;

public class MyThread {

    Thread myThread = new Thread(new Runnable() {
        @Override
        public void run() {
            // Code to be executed in the new thread
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread: "+Thread.currentThread().getName()+" " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    /*public void m1(){
        myThread.start();
    }*/
    public static void main(String[] args) {
            // Create a Thread using an anonymous inner class
            /*Thread myThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Code to be executed in the new thread
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread: " + i);
                        try {
                            Thread.sleep(1000); // Sleep for 1 second
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });*/

            // Start the thread
            //myThread.start();

        MyThread mt1 = new MyThread();
        mt1.myThread.setName("TH1");
        mt1.myThread.start();

        MyThread mt2 = new MyThread();
        mt2.myThread.setName("TH2");
        mt2.myThread.start();


    }
}
