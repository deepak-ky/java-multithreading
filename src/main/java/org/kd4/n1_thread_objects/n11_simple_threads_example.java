package org.kd4.n1_thread_objects;

import java.util.Date;

public class n11_simple_threads_example {

    public static void main(String[] args) throws InterruptedException {

        long patience = 10000;
        // long patience = 100000; // once try running  with 100 seconds also

        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop Thread");
        long startTime = System.currentTimeMillis();

        threadMessage("start time : " + new Date(startTime));

        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");

        while(t.isAlive()) {
            threadMessage("Still waiting....");

            t.join(1000); // wait one second for the message loop to finish

            if (((System.currentTimeMillis() - startTime) > patience) &&
                  t.isAlive()) {

                threadMessage("end time : " + new Date());

                threadMessage("Tired of waiting! 😫");

                t.interrupt(); // interrupts Messageloop
                t.join(); // waits indefinitely for Messageloop to die
            }
        }

        threadMessage("Finally 😤");
    }

    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " : " + message);
    }

    private static class MessageLoop implements Runnable {
        @Override
        public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };

            threadMessage("started messageloop thread");
            try {
                for(int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done! 😡");
            }
        }
    }
}
