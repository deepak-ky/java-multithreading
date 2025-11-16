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


/*
Two ways to run the bytecode with arguments, run from different places

* - java -cp src/main/java org.kd4.randomPlayground.argsStringArray yello "yello again" 1 "2 and 3"
* - java org.kd4.randomPlayground.argsStringArray "hello" "hello again" 1 "2 and 3"
* */