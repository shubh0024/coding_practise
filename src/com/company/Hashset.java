package com.company;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> h1= new HashSet(6,0.5f);

        h1.add(3);
        h1.add(34);
        h1.toArray();
        System.out.println(h1);
        System.out.println("print the same thing");
        h1.spliterator();

    }
}
