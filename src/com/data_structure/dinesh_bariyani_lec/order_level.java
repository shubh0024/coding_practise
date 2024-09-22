package com.data_structure.dinesh_bariyani_lec;
import java.util.LinkedList;
import java.util.Queue;

public class order_level {
    private treenode root;

    public class treenode {
        private int data;
        private treenode left;
        private treenode right;

        public treenode(int data) {
            this.data = data;
        }
    }

    public void createbinary(){
        treenode first =new treenode(1);
        treenode second  =new treenode(2);
        treenode third =new treenode(3);
        treenode fourth =new treenode(4);
        treenode seventh=new treenode(7);
        treenode fifth=new treenode(5);

        root=first;
        first.left=second;
        first.right=third;
        third.left=fourth;
        third.right=fifth;
        second.right=seventh;

    }

    public boolean isEmpty(){
        return root==null;
    }
    public void levelOrder(treenode root){
        if(root==null){
            return ;
        }
        Queue<treenode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            treenode temp=queue.poll();
            System.out.println(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);

            }


        }
    }


    public int findMax(){
        return findMax(root);
    }

    //find the maximum value of the binaryy tree
    public int findMax(treenode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int temp=root.data;
        int left=findMax(root.left);
        int right = findMax(root.right);

        if(left > temp){
             temp=left;
        }
        if(right > temp){
            temp=right;
        }
        return temp;

    }
    public static void main(String[] args) {
        order_level ol=new order_level();
        ol.createbinary();
        ol.levelOrder(ol.root);
        System.out.println(ol.findMax());
    }
}
