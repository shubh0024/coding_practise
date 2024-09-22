package com.data_structure.Stack_problems;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Stack<Integer> minStack;

    public static boolean isEmpty() {
        return head == null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            minStack.push(val);
        } else {
            newNode.next = head;
            head = newNode;
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        minStack.pop();
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1; // Or any appropriate value indicating no elements in the stack
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        String[] st1 = s1.substring(1, s1.length() - 1).replace("\"", "").split(",");
        String[] st2 = s2.substring(1, s2.length() - 1).replace("[]", " ")
                .replace("[", "").replace("]", "").split(",");

        MinStack minStack = new MinStack();
        for (int i = 0; i < st1.length; i++) {
            switch (st1[i]) {
                case "push":
                    minStack.push(Integer.parseInt(st2[i]));
                    break;
                case "pop":
                    minStack.pop();
                    break;
                case "getMin":
                    System.out.println(minStack.getMin());
                    break;
                case "top":
                    System.out.println(minStack.top());
                    break;
                default:
                    System.out.println("null");
                    break;
            }
        }
    }
}

