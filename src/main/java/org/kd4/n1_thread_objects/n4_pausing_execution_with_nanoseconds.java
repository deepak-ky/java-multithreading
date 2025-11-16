package org.kd4.n1_thread_objects;

public class n4_pausing_execution_with_nanoseconds {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Thread.sleep(2000, 70000);

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken : " + (endTime - startTime));
    }
}
