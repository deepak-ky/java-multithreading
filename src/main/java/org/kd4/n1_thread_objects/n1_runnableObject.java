package org.kd4.n1_thread_objects;

public class n1_runnableObject {
    public static void main(String[] args) {
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);

        thread.start();
        System.out.println("say hello from the main thread of n1_runnableObject");
    }
}

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("hello! from the HelloRunnable Thread");
    }
}
