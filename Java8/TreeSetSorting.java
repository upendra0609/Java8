package com.sikku;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSorting {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>((a, b) -> 1);

        ts.add(23);
        ts.add(2);
        ts.add(0);
        ts.add(63);
        System.out.println(ts);


    }
}
