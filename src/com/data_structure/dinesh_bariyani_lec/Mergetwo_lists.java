package com.data_structure.dinesh_bariyani_lec;

public class Mergetwo_lists {
    private static listnode head;

    private static class listnode {
        private int data;
        private listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        listnode current = head;
        while (current != null) {
            System.out.print(current.data + " -->");
            current = current.next;

        }
        System.out.println("null");
    }

    public void inertatbeg(int data) {
        listnode newnode = new listnode(data);
        newnode.next = head;
        head = newnode;
    }


    public void insertatlast(int data) {
        listnode newnode = new listnode(data);

        if (head == null) {
            head = newnode;
        } else {
            listnode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;

        }
    }

    public static listnode merge(listnode a, listnode b) {
        //a=1-->2-->4-->--6-->null
        //b=3-->5-->null
        //dummy=1-->2-->3-->4-->5-->6-->null
        listnode dummy = new listnode(0);
        listnode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        //traverse and check which tlist gto empty
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;

    }
        public static void main(String[] args) {
            Mergetwo_lists a=new Mergetwo_lists();
            a.insertatlast(1);
            a.insertatlast(3);
            a.insertatlast(5);
             a.display();

            ///insert at last
            Mergetwo_lists b=new Mergetwo_lists();
            b.insertatlast(2);
            b.insertatlast(6);
//            mergetwo_lists1.display();
            b.display();

//            Mergetwo_lists result=new Mergetwo_lists();
//            result.head=merge(mergetwo_lists1.head,mergetwo_lists2.head);
//            result.display();
        }
    }

