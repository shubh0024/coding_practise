package com.data_structure.dinesh_bariyani_lec;

public class delAT_beg {
    private static ListNode head;

    private static class ListNode {
        private int value;
        private ListNode next;


        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void inAtbeg(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    ////delete at the first node
    public ListNode delAtbeg() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }
    ////-------------------------------------------------
    ///delete the node at Last

    public ListNode delAtLast() {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode current = head;
            ListNode previous = null;

            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head==null ){
            return head;
        }
        ListNode current=head;
        int n=0;
        while(current!=null){
            n++;
        }
        int mid=n/2;

        if(n<mid){
            ListNode temp=current.next;
            temp.next=current.next;

        }

        return head;
    }

    ///-----------------------------------------------------------------
//delete the node at nth or given Position
    public void deleteAtN(int position) {
        //position is valid
        //1->4->7->8->9->null
        if(position==0 ){
            System.out.println("invalid index");
        }
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            //previous.next=previous.next.next;
            //size--;

        }
    }

    public boolean find(ListNode head, int searchkey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.value == searchkey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse(){
        if (head == null || head.next==null) {
            return ;
        }
        ListNode previous = head;
        ListNode current = head.next;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;

            //update
            previous = current;
            current = next;

        }
        head.next=null;
        head=previous;
    }
    public static void main(String[] args) {
       delAT_beg sll = new delAT_beg();
        sll.head = new ListNode(7);
        ListNode second = new ListNode(8);
       ListNode third = new ListNode(9);
        ListNode fourth  = new ListNode(10);
        ///connectin the node
        sll.head.next=second;
        second.next=third;
        third.next=fourth;




//        //inserting the element
        sll.inAtbeg(11);
        sll.inAtbeg(12);
        sll.inAtbeg(13);
        sll.inAtbeg(14);

        //print the linkedlist

//        //delete at first using the temp variable
//        sll.delAtbeg();
//        sll.delAtbeg();
       //-----------delete at LAst ndoe--------------

//          sll.delAtLast();
//
//          //---delete the node at nth or gieven positon
//        sll.deleteAtN(3);
//

        //print the linked list
        sll.deleteMiddle(head);
        sll.display();

        //revrese the array the linklist
//         sll.reverse();
//         sll.display();

//        if(sll.find(head,7)){
//            System.out.println("search key is found ");
//        }else{
//
//        }
    }
}
