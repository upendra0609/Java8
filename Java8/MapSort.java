package com.sikku;

import java.util.TreeMap;

public class MapSort {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> a > b ? -1 : a < b ? 1 : 0);

        map.put(100,"Sunny");
        map.put(200,"Bunny");
        map.put(50,"Chinny");
        map.put(10,"Sunny");

        System.out.println(map);

//        (a, b) -> a > b ? 1 : a < b ? -1 : 0


    }
}
