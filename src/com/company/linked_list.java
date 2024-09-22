package com.company;
import java.util.*;
import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(4);
        l1.add(5);
        l1.add(2);
        l1.add(8);
        l1.add(4);
        l2.add(0);
        l2.add(0,47);

        l2.add(456);
        l2.add(345);
        l2.add(0,444456);
        l2.add(8);
        l1.addAll(l2);

        System.out.println(l1.lastIndexOf(4));
        System.out.println(l1.contains(5));
        System.out.println(l1.lastIndexOf(456));
        System.out.println("printing and add element of l2 to l1 at index 6 ");
        System.out.println(l1.addAll(6,l2));
        System.out.println(l1.clone());
        System.out.println("descending iterator");
        System.out.println(l1.descendingIterator());
        System.out.println("getting the frist element");

        System.out.println(l1.getFirst());
        System.out.println("getting the last element ");
        System.out.println(l1.getLast());
        //it will add the element in the first place at array
        System.out.println(l1.offerFirst(2));
        //l1.clear();


        System.out.println(l1.indexOf(8));
        for(int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
