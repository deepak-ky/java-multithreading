package org.kd4.n1_thread_objects;

public class n11_simple_threads_example {

    public static int count = 0;

    public static void main(String[] args) {
        long patience = 1000 * 60 * 60;
        //if (args.length > 0)
    }

    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println(count + " : " + threadName + " : " + message);
        count++;
    }

    private class MessageLoop implements Runnable {
        @Override
        public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };

            try {
                for(int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }
}
