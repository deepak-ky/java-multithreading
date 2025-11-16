package org.kd4.randomPlayground;

public class argsStringArray {
    public static void main(String[] args) {
        System.out.println("okay now how do I run it directly");
        for(int i=0; i < args.length; i++) {
            System.out.println(i + " : "  + args[i]);
        }
        System.out.println("done");
    }
}
