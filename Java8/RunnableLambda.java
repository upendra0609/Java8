package com.sikku;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main");
        }
    }
}
