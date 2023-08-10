package com.sikku;

public  class Parent {
    static void m1(){
        System.out.println("parent");
    }
}

class Child extends Parent{
    public static void m1(){

    }
    public static void main(String[] args) {
        Child c = new Child();
        Parent.m1();
    }
}
