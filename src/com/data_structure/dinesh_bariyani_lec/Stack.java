package com.data_structure.dinesh_bariyani_lec;

import java.util.EmptyStackException;

public class Stack {
    private int length;
    private listnode top;
    private class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Stack(){
        top = null;
        length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        listnode temp=new listnode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(9);




        stack.pop();
        System.out.println(stack.peek());

    }
}
