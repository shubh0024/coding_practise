package com.data_structure.dinesh_bariyani_lec;

public class Bst_Validate {
    private treenode root;

    private class treenode {
        private int data;
        private treenode left;
        private treenode right;

        public treenode(int data) {
            
            this.data = data;
        }
    }
//        public void createbinarytree(){
//            treenode first =new treenode(1);
//            treenode second =new treenode(2);
//            treenode third =new treenode(3);
//            treenode fourth =new treenode(4);
//
//            root = first ;
//            first.left=second;
//            first.right=third;
//            second.left=fourth;
//
//        }

    public treenode insert(int data) {
        return root = insert(root, data);
    }

    public treenode insert(treenode root, int data) {
        if (root == null) {
            root = new treenode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public treenode printinorder(treenode root) {

        if (root == null) {
            return root;
        }
        
        printinorder(root.left);
        System.out.println(root.data + " ");
        printinorder(root.right);
        return root;

    }


        boolean validatebst(treenode root,long min,long max){
        if (root == null) {
            return true;
        }
        if(root.data <=min ||  root.data >=max){
            return false;
        }
        boolean left=validatebst(root.left,min, root.data);
        if(left){
            boolean right = validatebst(root.right,root.data,max);
            return right;
        }
          return false;
        }


    public static void main(String[] args) {
        Bst_Validate bsv=new Bst_Validate();
        bsv.insert(2);
        bsv.insert(1);
        bsv.insert(3);
        bsv.insert(4);
        bsv.printinorder(bsv.root);

        if(bsv.validatebst(bsv.root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            System.out.println("correct bst");
        }else{
            System.out.println("not validate");
        }
     }
    }

