package com.data_structure.dinesh_bariyani_lec;

public class Binarysearchtree {
    private treenode root;
    private class treenode{
        private int data;
        private treenode left;
        private treenode right;

        public treenode(int data){

            this.data=data;
        }
    }

    public void insertion(int value){

        root=insertion(root,value);
    }
     public treenode insertion(treenode root,int value){
        if(root==null){
            root=new treenode(value);
            return root;
        }

        if(value < root.data){
            root.left=insertion(root.left,value);

        }else{
            root.right=insertion(root.right,value);
        }
        return root;
}
public void inorder(treenode root){
        if(root==null){
            return ;
        }
    inorder(root.left);
    System.out.println(root.data+ " ");
    inorder(root.right);
    }

    //search the key
    public treenode search(int key){

        return search(root,key);
    }
    public treenode search(treenode root,int key){
        if(root == null || root.data==key){
            //base case
       return root;
        }

        if(key < root.data){
            return  search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    public static void main(String[] args) {
        Binarysearchtree bst=new Binarysearchtree();
        bst.insertion(1);
        bst.insertion(2);
        bst.insertion(3);
        bst.inorder(bst.root);
        if(null!=bst.search(3)){
            System.out.println("key found");
        }

    }
}
