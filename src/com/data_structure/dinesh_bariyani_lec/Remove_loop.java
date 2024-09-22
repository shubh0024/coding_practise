package com.data_structure.dinesh_bariyani_lec;

public class Remove_loop {

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
        while(current != null) {
            System.out.print(current.data + " -->");
            current= current.next;
        }
        System.out.println("null");
    }

    public void inersertAtbeg(int data){
        listnode newnode=new listnode(data);
        newnode.next=head;
        head = newnode;
    }

    public void createloop(){
        listnode first=new listnode(4);
        listnode second=new listnode(5);
        listnode third=new listnode(6);
        listnode fourth=new listnode(7);
        listnode fifth=new listnode(8);
        listnode sixth=new listnode(9);

        head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;

    }

    public void removeloop() {
        listnode firstptr = head;
        listnode slowptr = head;

        while (firstptr != null && firstptr.next != null) {
            firstptr = firstptr.next.next;
            slowptr = slowptr.next;

            if (slowptr == firstptr) {
                removeloop(slowptr);
                return;
            }
        }
    }
        private void removeloop(listnode slowptr){
            listnode temp=head;
            while(temp.next!= slowptr.next){
                temp=temp.next;
                slowptr=slowptr.next;

            }
            slowptr.next=null;
        }
        public static void main(String[] args) {
        Remove_loop rl=new Remove_loop();


//        rl.inersertAtbeg(2);
//        rl.inersertAtbeg(3);
//        rl.inersertAtbeg(4);
//        rl.inersertAtbeg(5);
//        rl.inersertAtbeg(6);
//
   rl.createloop();
   rl.removeloop();
        rl.display();

        }
}
