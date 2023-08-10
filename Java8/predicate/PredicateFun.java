package com.sikku.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateFun {
    public static void main(String[] args) {

        Predicate<Integer> p = (i) -> i > 5;

        Predicate<Collection> p1 = (c) ->c.isEmpty();

        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);

        System.out.println(p1.test(al));
    }
}
