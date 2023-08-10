package com.sikku.reference;

public class Main {
    public static void main(String[] args) {
        Interef i = Sample::new;
        Sample s = i.get();
        System.out.println(s);
    }
}

interface Interef{
    Sample get();
}

class Sample{
    public Sample() {
        System.out.println("Sample constructor");
    }
}
