package com.data_structure.dinesh_bariyani_lec;

public class circular_linkedlist {
    private listnode last;
    private int length;

    public class listnode{
        private listnode next;
        private int data;

        private listnode (int data){
            this.data=data;
            this.next=null;
        }

        public void circularlist(){
            last = null;
            length=0;

        }

        public boolean isEmpty(){
            //check the elment of the circular element
            return length==0;
        }

        public int length(){
            return length;
        }
    }
    public void createdispplay(){
        //creating the element of the circular linkedlist
        listnode first = new listnode(1);
        listnode second =new listnode(2);
        listnode third=new listnode(3);
        listnode fourth=new listnode(4);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;


        }

    public void display(){
        listnode first=last.next;
        if(last==null){
            return;
        }else{
            while(first!=last){
                System.out.print(first.data+"-->");
                first=first.next;
            }
            System.out.println(first.data+" ");//traverse the element of the circular linkedlist
        }
    }

    public void insertAtfirst(int data){
        listnode newnode=new listnode(data);
        if(last==null){
            last=newnode;
        }else{
            newnode.next=last.next;
        }
        last.next=newnode;
        length++;
    }

    public void insertAtlast(int data){
        listnode newnode =new listnode(data);
        if(last==null){
            last=newnode;
            last.next=last;
        }else{
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
        }
        length++;
    }

    public void deleteAtfirst(){
        listnode temp=last.next;
        if(last==null){
            return ;
        }
        else{
            last.next=temp.next;
            temp.next=null;
        }
        last=last.next;
    }
    public static void main(String[] args) {
        circular_linkedlist cll=new circular_linkedlist();
        cll.createdispplay();
        cll.insertAtfirst(6);

        //inserting the element at the last position
        cll.insertAtlast(2);
         cll.deleteAtfirst();
        cll.display();


    }
}
