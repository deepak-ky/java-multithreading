package org.kd4.n1_thread_objects;

public class n6_checking_interrupted_flag {
    public static void main(String[] args) {
        Thread thread = new Thread(new runnableWorker());
        thread.start();

        /*
        This is just for giving the "for" loop inside runnable some time to run
        */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("caught new exception");
        }

        System.out.println("Main : Interrupting Worker...");
        thread.interrupt();

    }
}

class runnableWorker implements Runnable {
    @Override
    public void run() {
        System.out.println("Worker: Starting work....");

        try {
            for(int i = 0; i<5; i++) {
                System.out.println("Worker Going to sleep : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Worker: Interrupted Exception caught!");
            System.out.println("Worker : interrupt flag inside catch = " + Thread.currentThread().isInterrupted());

            Thread.currentThread().interrupt();
            System.out.println("Worker : interrupt flag restored = " + Thread.currentThread().isInterrupted());
        }
    }
}
