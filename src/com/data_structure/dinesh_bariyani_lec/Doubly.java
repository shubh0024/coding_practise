package com.data_structure.dinesh_bariyani_lec;

public class Doubly {

    private listnode head;
    private listnode tail;
    private int length;


    private class listnode {
        private int data;
        private listnode head;
        private listnode next;
        private listnode previous;

        public listnode(int data){

            this.data=data;
        }
    }
    public Doubly(){
        this.head=null;
        this.tail=null;
        this.length=0;

    }
    public boolean isEmpty(){
        return length==0;
    }
    public void displayForward(){
        if(head==null){
            return ;
        }
        listnode current=head;
        while(current!=null){
            System.out.print(current.data+ "-->");
            current=current.next;

        }
        System.out.println("null");
    }

    public void displaybackward(){
        if(tail==null){
            return ;
        }
        listnode current =tail;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.previous;
        }
        System.out.println("null");
    }
  public void inserATLAst(int data){
        listnode newnode=new listnode(data);
        if(isEmpty()) {
            head = newnode;
        }else{
            tail.next=newnode;
        }
        newnode.previous=tail;
        tail=newnode;
        length++;
  }
//  public void deleteAtLast(){
//        if(isEmpty()){
//            return ;
//        }
//        listnode current =head;
//        while(current!=null){
//            current.next=head;
//        }
//
//  }
  public void insertATbeg(int data){
        listnode newnode=new listnode(data);
        if(isEmpty()){
            head=newnode;
        }else{
            head.previous=newnode;
        }
        newnode.next=head;
        head=newnode;
  }
    public static void main(String[] args) {
        Doubly dll=new Doubly();
        dll.inserATLAst(3);
        dll.inserATLAst(4);
        dll.inserATLAst(6);
        dll.insertATbeg(13);
        dll.displaybackward();
        dll.displayForward();
    }
}
