package com.data_structure.dinesh_bariyani_lec;

import java.util.NoSuchElementException;

public  class deleteAtLast {
    private listnode head;

    private listnode tail;
    private int length;

    private class listnode{
        private int data;
        private listnode next;
        private listnode prev;

        public listnode(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }
//        public deleteAtLast(){
//            this.next = null;
//            this.prev = null;
//            this.length=0;
//        }

    public boolean isEmpty(){

        return length==0;
    }

    public void insertAtLast(int data){
        listnode newnode=new listnode(data);
        if(head==null){
            head=newnode;
        }else{
            tail.next=newnode;
        }
        newnode.prev=tail;
        tail=newnode;
        length++;
    }
    public void displayfrwrd(){
        if(head==null){
            return ;
        }
        listnode current =head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current =current.next;
        }
        System.out.println("null");
    }

    public listnode deleteAtLast(){
        listnode temp=tail;
        if(isEmpty()){
            return null;
        }else{

            tail.prev.next=null;
        }
        tail=tail.prev;
        temp.next = null; //last node to temporary node me rakhe usse free to krna hi parega na
        return temp;
    }

public void displaybackward(){
        if(isEmpty()){
            return ;
        }
        listnode current =tail;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.prev;
        }
    System.out.println("null");
}
public void deleteATfirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
    listnode temp =head;
        if(head==tail){
            tail = null ;
        }else {
            head.next.prev=null ;
        }
        head =head.next;
        temp.prev=null;


}
    public static void main(String[] args) {

        deleteAtLast Dll=new deleteAtLast();
        Dll.insertAtLast(4);
        Dll.insertAtLast(3);
        Dll.insertAtLast(2);
        Dll.insertAtLast(1);

// Dll.deleteAtLast();

        Dll.deleteATfirst();


Dll.displaybackward();

        Dll.displayfrwrd();//delete krna hai na bhayi use kro iske


    }


}
