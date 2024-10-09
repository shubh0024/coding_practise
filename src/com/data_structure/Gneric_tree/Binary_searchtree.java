package com.data_structure.Gneric_tree;

public class Binary_searchtree {
    public static class Node {
        int data;

        Node left;
        Node right;

        public Node(int data, Node right, Node left) {
            this.data = data;
            this.left = left;
            this.right = right;

        }
    }


        public static Node construct(int[] arr, int lo, int hi) {

        if(lo>hi){
            return null;
        }
            int mid = (lo + hi) / 2;

            int data = arr[mid];
            Node rc = construct(arr, lo, mid - 1);
            Node lc = construct(arr, mid + 1, hi);

            Node node = new Node(data, lc, rc);
            return node;
        }


        public static void display(Node node) {
            if (node == null) {
                return;
            }
            String str = "";
            str += node.left == null ? "." : node.left.data + " ";
            str+= "<-" + node.data + "->";
            str += node.right == null ? "." : node.right.data + "";
            System.out.println(str);

            display(node.left);
            display(node.right);
        }

        public static void main(String[] args) throws Exception {
            int[] arr = {12, 25, 37, 50, 62, 75, 87};
            Node root = construct(arr, 0, arr.length - 1);
               display(root);
            System.out.println(root);
        }
    }
