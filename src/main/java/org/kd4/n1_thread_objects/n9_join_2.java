package org.kd4.n1_thread_objects;

public class n9_join_2 {
    public static void main(String[] args) {
        Thread worker1 = new Thread(new RunnableWorkerOne());
        Thread worker2 = new Thread(new RunnableWorkerTwo());

        worker1.start();
        worker2.start();

        try {
            System.out.println("Main working for workers...");
            worker1.join();
            worker2.join();
            System.out.println("Both workers finished. Main continues...");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting!");
        }
    }
}

class RunnableWorkerOne implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Worker 1 starting....");
            Thread.sleep(3000);
            System.out.println("Worker 1 done.");
        } catch (InterruptedException e) {
            System.out.println("Worker 1 interrupted..");
        }
    }
}

class RunnableWorkerTwo implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Worker 2 starting....");
            Thread.sleep(5000);
            System.out.println("Worker 2 done.");
        } catch (InterruptedException e) {
            System.out.println("Worker 2 interrupted..");
        }
    }
}
