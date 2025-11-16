package org.kd4.n1_thread_objects;

public class n5_interrupted_exception {
    public static void main(String[] args) {
        System.out.println("new main document");

        for (int i=0; i<5; i++) {
            try {
                System.out.println("working on :" + i);
                doWork(i);
            } catch (InterruptedException e) {
                System.out.println("caught interrupted exception : { " + e + " }");
            }
        }
    }

    public static void doWork(int i) throws InterruptedException {
        if(i == 2) {
            throw new InterruptedException("A NEW INTERRUPTED EXCEPTION BECAUSE 2 WAS PASSED");
        }
    }
}
