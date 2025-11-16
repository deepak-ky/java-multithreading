package org.kd4.n1_thread_objects;

public class n7_interrupted_exception_2 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            try {
                System.out.println("working on :" + i);
                doWork(i);
            } catch (InterruptedException e) {
                System.out.println("caught interrupted exception : { " + e + " }");
                System.out.println("------");

                System.out.println("interrupt flag now : " + Thread.currentThread().isInterrupted());
                System.out.println();

                System.out.println("restoring the interrupt flag...");
                Thread.currentThread().interrupt();
                System.out.println();

                System.out.println("restored interrupt flag now : " + Thread.currentThread().isInterrupted());
                System.out.println();

                System.out.println("using Thread.interrupted() method to get status : " + Thread.interrupted());
                System.out.println();

                System.out.println("interrupt flag now (Thread.interrupted() would reset it) : " + Thread.currentThread().isInterrupted());
                System.out.println("-------");
            }
        }
    }

    public static void doWork(int i) throws InterruptedException {
        if(i == 2) {
            throw new InterruptedException("A NEW INTERRUPTED EXCEPTION BECAUSE 2 WAS PASSED");
        }
    }
}