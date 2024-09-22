package com.data_structure.dinesh_bariyani_lec;

public class reverse_element_LL {

    private static listnode head;

    public static class listnode {
        private int data;
        private listnode next;


        public listnode(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void printList() {
        listnode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtbeg(int value) {
        listnode newNode = new listnode(value);
        newNode.next = head;
        head = newNode;
    }

    public void revrselist() {
        if (head == null || head.next == null) {
            return;
        }
        listnode previous = head;
        listnode current = head.next;
        while (current != null) {
            listnode next = current.next;
            current.next = previous;

            //update         previous = current;
//       
            current = next;
        }
        head.next = null;
        head = previous;
    }

    //using recursion the finds the revrse list for the linked lists
    public listnode recursive(listnode head) {
        if (head == null || head.next == null) {
            return head;
        }
        listnode newhead = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }

    //==========================GET THE MIDDLE NODE=========================================================
    public listnode getmiddlenode() {
        if (head == null) {
            return null;
        }
        listnode pahleptr = head;
        listnode badptr = head;
        while (badptr != null && badptr.next != null) {
            pahleptr = pahleptr.next;
            badptr = badptr.next.next;

        }
        return pahleptr;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++\
    public listnode getnthnodefromend(int n) {
        if (head == null) {
            return null;

        }
        if (n <= 0) {
            throw new IllegalArgumentException("invalid input");
        }

        listnode mainptr = head;
        listnode refptr = head;

        int count = 0;

        while (count < n) {
            if (refptr == null) {
                throw new IllegalArgumentException(n + "GREATER THAN THE NUMBER IN node");
            }
            refptr = refptr.next;
            count++;
        }
        while (refptr != null) {
            refptr = refptr.next;
            mainptr = mainptr.next;
        }


        return mainptr;
    }

    //REMOVE THE DUPLICATE ELELMENT IN THE LINKEDLISTS
    public void findduplicate(){
        if(head == null){
            return ;
        }
        listnode current=head;
        while(current !=null && current.next != null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current =current.next;
            }
        }
    }

    //inset the element in the sorted lists
    public listnode inserInSortedLists(int value){
        listnode newnode=new listnode(3);
        if(head==null){
            return newnode;
        }
        listnode current =head;
        listnode temp=null;
        while(current!=null && current.data < newnode.data ){
//iteration is done by this
                temp = current;
                current = current.next;
        }
        newnode.next = current;
        temp.next = newnode;
        return head;
    }

    //removing the element given key from thwe singly linked lists
    public void RemoveAkey(int key){
        if(head==null){
            return ;
        }
        listnode current=head;
        listnode temp=null;
        if(current !=null && current.data==key){
            head = current.next;
            return;
        }
        while(current!=null && current.data!=key){
            temp=current;
            current =current.next;

        }
        if(current ==null){
            return ;
        }
        temp.next = current.next ;
    }
    public static void main(String[] args) {
        reverse_element_LL rv = new reverse_element_LL();
//        rv.head = new listnode(10);
//        listnode second = new listnode(1);
//        listnode third = new listnode(8);
//        listnode fourth = new listnode(5);
//
//        //now we weill connect them together to form a chain
//        rv.head.next = second; //10-->1
//        second.next=third;//10-->1-->8
//        third.next=fourth;//10-->1-->8-->11--.null

        rv.insertAtbeg(7);
        rv.insertAtbeg(11);
        rv.insertAtbeg(12);
        rv.insertAtbeg(24);
        rv.insertAtbeg(25);


        rv.printList();
        rv.revrselist();
        rv.printList();
         rv.head=rv.recursive(rv.head);
         rv.printList();

         //GET THE MIDDLE NODE NODE FROM TEH THE STARTING
        listnode middlenode=rv.getmiddlenode();
        System.out.println(middlenode.data);


//finding the element at the nth node from the end
        listnode nthnodeptr=rv.getnthnodefromend(5);
        System.out.println("the elelment at the nth node is "+nthnodeptr.data);

        //removing the duplicate
        rv.findduplicate();
        rv.printList();

//        ///insert a node in sorted order linked lists
//        rv.inserInSortedLists(13);
//        rv.printList();
        //sending the illegal arguments exception

        //delte the node from using the key
        rv.RemoveAkey(12);
        rv.printList();
    }
}