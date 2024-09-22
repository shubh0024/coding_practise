package com.data_structure.dinesh_bariyani_lec;

import java.util.NoSuchElementException;

public class Queue_insertAtbeg{
    private listnode front;
    private listnode rear;

    public Queue_insertAtbeg(){
        front=null;
        rear=null;
        length=0;

    }
    private int length;
    private class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return  length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void Enqueue(int data) {
        listnode newnode = new listnode(data);
        if (isEmpty()) {
            front = newnode;
        } else {
            rear.next=newnode;
        }
        rear=newnode;
        length++;
    }
     public int Dequeue(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        int result = front.data;
             front=front.next;
        if(front==null){
            rear=null ;
        }
        length--;
        return result;

    }

    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");

        }
        return front.data;
    }

    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("queue is Already empty");
        }
        return rear.data;
    }
     public void dispaly(){
        if(isEmpty()){
            return ;
        }
        listnode current =front;
        while(current!=null){
            System.out.println(current.data+" -->");
            current =current.next;
        }
     }

    public static void main(String[] args) {
        Queue_insertAtbeg queue=new Queue_insertAtbeg();
        queue.Enqueue(4);
        queue.Enqueue(5);
        queue.Enqueue(6);
        queue.Enqueue(7);

//        queue.dispaly();
        queue.Dequeue();//delete krna hai na ji to isko use karo na
        queue.dispaly();
        System.out.println(queue.first());
        System.out.println(queue.last());
    }
}
