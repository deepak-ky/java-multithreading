package org.kd4.n1_thread_objects;

public class n3_pausing_execution_with_sleep {
    public static void main(String[] args) throws InterruptedException {
        String sentences[] = {
                "Shyam loves to play",
                "Shyam eats good food",
                "Shyam works hard"
        };

        for (int i = 0;i<sentences.length;i++) {
            Thread.sleep(3000);
            System.out.println(sentences[i]);
        }
    }
}
