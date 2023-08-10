package com.sikku;

public class Inher {

    int x = 10;
    public void m1(){
        System.out.println("parent m1");
    }

    public static void m2(int x){
        System.out.println("parent static");
    }
}

class Chi extends Inher{
    int x =12;
    public void m1(){
        System.out.println("child m1");
    }

    public static void m2(int x){
        System.out.println("child static");
    }

    public static void main(String[] args) {
        Inher p = new Chi();
        Chi c = new Chi();
        p.m1();
        p.m2(5);
        c.m2(9);

        System.out.println(p.x);
        System.out.println(c.x);
    }
}
