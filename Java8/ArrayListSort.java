package com.sikku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort {
    public static void main(String[] args) {
        Comparator<Integer> com = (a, b) -> a > b ? -1 : a == b ? 0 : 1;

        ArrayList<Integer> al = new ArrayList<>();

        al.add(34);
        al.add(76);
        al.add(14);
        al.add(56);
        al.add(45);
        al.add(22);

        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);
        al.sort(com);
        System.out.println(al);
    }

}
