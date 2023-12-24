package com.sikku;

import java.util.HashMap;

public class OptionalTests {
    public static void main(String[] args) {
        HashMap<Integer, String> map = data();


    }

    public static HashMap<Integer, String> data() {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "AAA");
        hashMap.put(2, null);
        hashMap.put(3, "abc");
        hashMap.put(4, null);
        hashMap.put(5, "hsfjhdjlf");
        return hashMap;
    }
}
