package com.data_structure.Gneric_tree;

public class longest_Zigzag_tree {
    public static void main(String[] args) {

        // Definition for a binary tree node.
         class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {
            }

            TreeNode(int val) {
                this.val = val;
            }

            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

        class Solution {
            public int maxLength = 0;

            public void Zigzag(TreeNode root, int dir, int currLen) {
                if (root == null) return;
                maxLength = Math.max(maxLength, currLen);
                if (dir == 1) {
                    Zigzag(root.left, 0, currLen + 1);
                    Zigzag(root.right, 1, 1);
                } else {
                    Zigzag(root.right, 1, currLen + 1);
                    Zigzag(root.left, 0, 1);
                }
            }

            public int longestZigZag(TreeNode root) {
                Zigzag(root, 0, 0);
                Zigzag(root, 1, 0);

                return maxLength;
//                System.out.println(maxLength);
            }

        }
    }
}