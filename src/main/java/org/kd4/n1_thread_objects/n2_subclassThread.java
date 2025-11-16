package org.kd4.n1_thread_objects;

public class n2_subclassThread {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        helloThread.start();
        System.out.println("say hello from the main thread of n1_subclassingThread");
    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello from HelloThread :)");
    }
}