package com.company;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();

        ad1.add(4);
        ad1.add(45);
        ad1.add(387);
        ad1.add(4);
        ad1.add(4);
        ad1.remove(4);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);
        System.out.println(ad1.descendingIterator());
    }
}
