package com.striver.DSAExperience.T12Tree.BinaryTree;

import com.striver.DSAExperience.T12Tree.TreeNode;

public class MaximumDepthOfBinaryTree_easy_104 {
    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(sol.maxDepth(root));
    }
}
