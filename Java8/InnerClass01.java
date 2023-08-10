package com.sikku;

public class InnerClass01 {
    int x=1;

    public static void main(String[] args) {

//        Runnable r = ()->{
//            int x= 12;
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread");
//            }
//        };

        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread");
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
    }
}
