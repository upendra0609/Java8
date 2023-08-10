package com.sikku;

public class InnerClass {

    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            for (int i=0; i<10; i++){
                System.out.println("Thread1");
            }
        }
    };


    public static void main(String[] args) {

        int x= 0;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int x =2;
                for (int i=0; i<10; i++){
                    System.out.println("Thread");
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i=0; i<10; i++){
            System.out.println("Main");
        }

//        Thread t1 = new Thread(new InnerClass().r1);
//        t1.start();
    }
}
