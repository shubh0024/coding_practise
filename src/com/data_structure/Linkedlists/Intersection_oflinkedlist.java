package com.data_structure.Linkedlists;

public class Intersection_oflinkedlist {
    public static node head;

    public static class node{
        public int data;

        private node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display(){
        node curr=head;
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }


    public int length(){
        if(head==null) return 0;
        int count=0;

        node curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }


    public void addLast(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
        }else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }


    }

    public void addfirst(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }


    public void ingivenpostion(int data,int where){
        node newnode =new node(data);

        if(where==1){
            newnode.next=newnode;
            head=newnode;
        }else{
            node curr=head;
            int count=0;
            while(count<where - 1){
                curr=curr.next;
                count++;
            }
            node temp=curr.next;
            curr.next=newnode;
            newnode.next=temp;

        }
    }
    public static void main(String [] args){
        Intersection_oflinkedlist is = new Intersection_oflinkedlist();
        is.addLast(4);
        is.addLast(5);
        is.addLast(3);
        is.addfirst(7);

        is.ingivenpostion(10,2);
        is.display();
    }
}
