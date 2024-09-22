package com.data_structure.dinesh_bariyani_lec;

public class detectALoop{
    private static listnode head;

    private class listnode{

        private int data;
        private listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        listnode current =head;
        while(current!=null){
            System.out.print(current.data+ "-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void insertAtbeg(int data){
            listnode newnode=new listnode(data);
            newnode.next= head;
            head =  newnode;
        }

        //detetct  aloop in linked linked lists
    public boolean detectloop(){
        listnode slowptr=head;
        listnode fastptr=head;
        while(fastptr!=null && fastptr.next!=null ){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;

            if(slowptr==fastptr){
                return true;
            }
        }
        return false;
    }

    //creating the loop
    public void createLooplist(){
        listnode first =new listnode(1);
        listnode second =new listnode(2);
        listnode third =new listnode(3);
        listnode fourth =new listnode(4);
        listnode fifth=new listnode(5);
        listnode sixth  =new listnode(6);

        head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
    }
///find the start of a loop in a singly linked listed

    public listnode StartingnodeInLoop(){
        listnode fastptr=head;
        listnode slowptr=head;

        while(fastptr!=null && fastptr.next!=null)
        {
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;

            if(slowptr==fastptr){
                return getStartingNode(slowptr);
            }
        }
return null;
    }
    public listnode getStartingNode(listnode slowptr){
        listnode temp=head;
        while(temp!=slowptr){
            temp= temp.next;
            slowptr=slowptr.next;

        }//that said by the floyds algrorithm thts when meets
        return temp;

    }

        public static void main(String[] args) {
            detectALoop dta=new detectALoop();
//            dta.insertAtbeg(1);
//            dta.insertAtbeg(2);
//            dta.insertAtbeg(3);
//            dta.insertAtbeg(4);
//            dta.display();

            //creating the loop
            dta.createLooplist();
            System.out.println("Linked list you have created conatining teh loop is true" +
                    ""+dta.detectloop());
   ///finding the start looping of the single linked list
            System.out.println(dta.StartingnodeInLoop().data);
        }
    }


