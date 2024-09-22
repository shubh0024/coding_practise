package com.data_structure.dinesh_bariyani_lec;

public class stack_using_array {

    private int top;
    private int[] arr;

    //constructors;
    public stack_using_array(int capacity) {
        top = -1;
        arr = new int[capacity];
    }

    public stack_using_array() {
        this(10);
    }

    public boolean isFull() {

        return arr.length == size();
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("satck is full");

        }
        top++;
        arr[top] = data;
    }


    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        //dhyan rhe ki jab result ko print krwana ho
        int result = arr[top];
        top--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }

        return arr[top];
    }

    public static void main(String[] args) {
        stack_using_array stack=new stack_using_array();
        stack.push(4);
        stack.push(5);
        stack.push(6);

       stack.pop();

       stack.push(9);
        System.out.println(stack.peek());


    }


}
