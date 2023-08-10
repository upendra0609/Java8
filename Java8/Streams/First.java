package com.sikku.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class First {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(0);
        l1.add(84);
        l1.add(70);
        l1.add(65);
        l1.add(45);
        System.out.println(l1);

        List<Integer> l2 = l1.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());

        Optional<Integer> min = l1.stream().max(Integer::compareTo);
        if (min.isPresent()) {
            int i = min.get();
            System.out.println(i);
        }


        Integer[] ar = (Integer[]) l1.stream().toArray();

        System.out.println(l2);

        Stream<Integer> s = Stream.of(1,2,4,6);
        Integer[] arr = {1,2,3,4};
        Stream<Integer> s2 = Stream.of(arr);

    }
}
