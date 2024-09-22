package com.data_structure.Stack_problems;

import java.util.Scanner;

public class normal_stack {

        int[] arr;
        int top;

        normal_stack(int cap) {
            top = -1;
            arr = new int[cap];//jitne capacity ka hai utna array me define karege

        }

        public boolean isEmpty(){
            return top <0;
        }

    public boolean isFull() {

        return arr.length == size();
    }

    public int size() {

            return top + 1;
        }


        public void display() {
            while(isEmpty()) {
                for (int i = top; i >= 0; i--) {
                    System.out.print(arr[top] + " ");
                    top--;
                }

            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("stack underflow");
            } else {
                int temp = arr[top];
                top--;
                return temp;

            }
            return  0;
        }

        public int Top() {
            if (isEmpty()) {
                throw new RuntimeException("stack underrflow");
            } else {
                return arr[top];
            }
        }

        public void push(int val) {
            if (isFull()) {
                 throw new RuntimeException("stack is full");
            } else {
                top++;

                arr[top] = val; //array ke top me dal denge
            }
        }


        public static void main(String[] args) throws Exception{
            normal_stack st = new normal_stack(6);

            st.push(5);
            st.push(5);
            st.push(6);
            st.pop();

            st.push(7);
            st.push(3455);
            st.size();
            st.pop();
            st.display();

            System.out.println(st.Top());



        }
    }
