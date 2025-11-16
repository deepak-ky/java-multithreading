package org.kd4.n1_thread_objects;

public class n8_join_1 {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            try {
                System.out.println("Worker started...");
                for (int i=0;i<6;i++) {
                    System.out.println("Worker working at : " + i);
                    Thread.sleep(1000);
                }
                System.out.println("Worker done.");
            } catch (InterruptedException e) {
                System.out.println("Worker interrupted");
            }
        });

        worker.start();

        System.out.println("MAIN CODE STARTING...");

        try {
            worker.join();

            if (worker.isAlive()) {
                System.out.println("Worker IS ALIVE, BUT MOVING ON IN MAIN");
            } else {
                System.out.println("Worker IS NOT ALIVE, IT IS COMPLETE, MOVING ON IN MAIN");
            }

        } catch (InterruptedException e) {
            System.out.println("MAIN CODE INTERRUPTED");
        }

        System.out.println("MAIN CODE DONE.");

    }
}

