package com.sikku;

@FunctionalInterface
interface A {
    void print(String s);

    boolean equals(Object obj);

    String toString();

    public static void main(String[] args) {
        System.out.println("Hello");
    }

}