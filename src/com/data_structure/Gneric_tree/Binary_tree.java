package com.data_structure.Gneric_tree;

import java.util.Stack;

public class Binary_tree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    public static class Pair{
        Node node;
        int state;

        Pair(Node node,int state){
            this.state=state;
            this.node=node;
        }
    }

    public static void display(Node node){


        if(node == null){
            return ;
        }
        String str="";
       str+= node.left==null? "." : node.left.data + " ";

       str+="<-" + node.data + "->";

       str+= node.right == null ? "." : node.right.data + "";

        System.out.println(str);

        display(node.left);
        display(node.left);



    }

    public static void printKLevelsDown(Node node,int k){
        if(node == null || k<0){
            return;
        }
        if(k==0){
            System.out.println(node.data);
        }

        printKLevelsDown(node.left,k-1);
        printKLevelsDown(node.right,k-1);
    }


    public static void main(String [] args) throws Exception{
        Integer[] arr ={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = new Node(arr[0],null,null);

        Pair rtp=new Pair(root,1);
        Stack<Pair> st=new Stack<>();
        st.push(rtp);


   int idx=0;
        while(st.size()>0){
            Pair top=st.peek();
            if(top.state==1){
                idx++;
                if(arr[idx]!=null){
                    top.node.left=new Node(arr[idx],null,null);
//                    top.node.left=ln;

                    Pair lp=new Pair(top.node.left,1);
                    st.push(lp);
                }else{
                    top.node.left=null;
                }
                top.state++;

            } else if (top.state==2) {
                idx++;
                if(arr[idx]!=null){
                    top.node.right=new Node(arr[idx],null,null);
//                    top.node.left=ln;

                    Pair rp=new Pair(top.node.right,1);
                    st.push(rp);
                }else{
                    top.node.right=null;
                }
                top.state++;

            }else{
                st.pop();
            }
        }
        System.out.println(root);
    }


    }

