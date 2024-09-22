package com.data_structure.dinesh_bariyani_lec;

public class singly_linklist {

    public static ListNode head; ///instance variable for linked lists

private static class ListNode{
    private int data ; //generic type
    private ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next = null;
    }
    }
    //print the singly linkked lists-----------------------------------------
    public void display(){
        ListNode current = head; //temporary nodde that is current
        while(current != null){
            System.out.print(current.data +"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    //----------------------------------------------------------
//fort measuring the length of the linked lists
    public int  length(){
    if(head==null){
        return 0;
    }
    int count =0;
    ListNode current = head;
    while(current!=null){
        count++;
        current = current.next;}
    return count ;
    }

    ////insert at first position
    public void insertAtbeg(int value){//insert the elelement at the begining
     ListNode newNode = new ListNode(value);
     newNode.next=head;
      head = newNode;
    }
    ///insert at node at last ---------------------------------------
    public void inATlast(int value){
    ListNode newNode= new ListNode(value);
    if(head==null){
        head=newNode;

    }else {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }
    }
    //---------------------------------------------------------------
//insert at the given position
    public void insertAtgiv(int position,int value) {
        //1->4->5
        //1->6->4->5
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }

    }
        ///-------------------------------revrese the Linkedlists


    public static void main(String[] args) {
        singly_linklist sll = new singly_linklist();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(5);
//
//        //now we weill connect them together to form a chain
//        sll.head.next = second; //10-->1
//        second.next=third;//10-->1-->8
//        third.next=fourth;//10-->1-->8-->11--.null



//           sll.insertAtbeg(11);
//           sll.insertAtbeg(12);
//           sll.insertAtbeg(13);
//           sll.insertAtbeg(14);
//           sll.insertAtbeg(14);

//        System.out.println("the number node present in node "+sll.length());

        ///insert at last
        sll.inATlast(15);
        sll.inATlast(16);
        sll.inATlast(17);

        singly_linklist sll2 = new singly_linklist();
        sll2.inATlast(1);
        sll2.inATlast(1);
        sll2.inATlast(1);
        sll2.inATlast(1);


        //insert at given position
//        sll.insertAtgiv(3,15);
//        sll.insertAtgiv(5,15);
        //print the linkedlist
        sll.display();
        sll2.display();


       }
}
