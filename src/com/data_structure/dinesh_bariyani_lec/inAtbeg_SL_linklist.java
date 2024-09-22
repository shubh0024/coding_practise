package com.data_structure.dinesh_bariyani_lec;

public class inAtbeg_SL_linklist {
    private ListNode head;

    static class ListNode {
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
         public void inAtbeg(int value){
          ListNode newNode=new ListNode(value);
          newNode.next=head;
          head=newNode;
         }

        public static void main(String[] args) {
            inAtbeg_SL_linklist sll = new inAtbeg_SL_linklist();
            sll.head = new ListNode(7);
            ListNode second = new ListNode(8);
            ListNode third = new ListNode(9);
            ListNode fourth  = new ListNode(10);
         ///connection the node
            sll.head.next=second;
            second.next=third;
            third.next=fourth;




            //inserting the element
            sll.inAtbeg(11);
            sll.inAtbeg(12);
            sll.inAtbeg(13);
            sll.inAtbeg(14);
            //print the linkedlist
            sll.display();
        }
    }

