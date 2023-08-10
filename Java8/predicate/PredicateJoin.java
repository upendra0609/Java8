package com.sikku.predicate;

import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 33, 67, 9, 65, 34, 78};
        Predicate<Integer> p1 = i -> i > 10;

        Predicate<Integer> p2 = p1;

        Predicate<Integer> p3 = i -> i % 2 == 0;
//        m1(p1.and(p2), arr);
//
//        System.out.println("///////");
//        m1(p1.negate().and(p2.negate()), arr);

//        System.out.println(p1.equals(p2));


        //Predicate isEqual

        Predicate<String> p4 = Predicate.isEqual("ASDF");

        System.out.println(p4.test("ASDF"));

    }

    public static void m1(Predicate<Integer> p, int[] ar) {
        for (int x : ar) {
            if (p.test(x)) {
                System.out.println(x);
            }
        }
    }
}
