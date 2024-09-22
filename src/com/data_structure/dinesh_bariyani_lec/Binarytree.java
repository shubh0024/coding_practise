package com.data_structure.dinesh_bariyani_lec;
import java.util.Stack;

public class Binarytree{

    private treenode root;
    public class treenode {
        private int data;
        private treenode left;
        private treenode right;

        public treenode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public boolean isempty(){
        return root==null;
    }

    public void createBinarytree(){
        treenode first =new treenode(1);
        treenode second=new treenode(2);
        treenode third=new treenode(3);
        treenode fourth =new treenode (4);
        treenode fifth=new treenode(5);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    public void printtree(){
        if(isempty()) {
            return;
        }
        treenode current=root;
        while(current!=null){
            System.out.println(current.data+"-->");
        }
    }


    //this method is  using the recursive order to implement the preorder.
    public void preorderdisplay(treenode root){
        if(root==null){
            return ;
        }
        System.out.println(root.data+ " ");
        preorderdisplay(root.left);
        preorderdisplay(root.right);

    }

    //this methode is used the iterative order to use preorder
    public void iterativepreorder(){
        if(isempty()){
            return ;
        }
        Stack<treenode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            treenode temp = stack.pop();
            System.out.println(temp.data + " ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }

    //inorder recursive mehod
    public void inorder(treenode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

//iterativeorder
    public void iterativeinorder(treenode root){
        if(root==null){
            return ;
        }
        Stack<treenode> stack =new Stack<>();

        treenode temp=root;
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                System.out.println(temp.data+" ");
                temp=temp.right;
            }


        }
    }

    //postorder using the recursive method
    public void recursivepreorder(treenode root){
        if(root==null){
            return ;
        }
        recursivepreorder(root.left);
        System.out.println(root.data +" ");
        recursivepreorder(root.right);
    }

    //iterative postorder

    public void iterativepostorder(treenode root){
        if(root==null){
            return ;
        }
        Stack<treenode> stack =new Stack<>();
        treenode current=root;
        while(!stack.isEmpty() || current!=null){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }else{
                treenode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.println(temp.data+ " ");
                    while(!stack.isEmpty() && temp==stack.peek().right ){
                        stack.pop();
                        System.out.println(temp.data+ " ");
                    }
                }else{
                    current=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Binarytree bt =new Binarytree();
        bt.createBinarytree();
//        bt.preorderdisplay(bt.root);
//        bt.iterativepreorder();//iterative order for the implementing the preorder
//     bt.inorder(bt.root);
//     bt.iterativeinorder(bt.root);

     //iterative omethod for the postorder
        bt.iterativepostorder(bt.root);
    }
}
