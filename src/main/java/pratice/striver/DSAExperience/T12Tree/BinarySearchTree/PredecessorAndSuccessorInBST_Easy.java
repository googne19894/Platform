package pratice.striver.DSAExperience.T12Tree.BinarySearchTree;

import pratice.common.Out;
import pratice.striver.DSAExperience.T12Tree.common.BinaryTreeNode;

import java.util.ArrayList;

public class PredecessorAndSuccessorInBST_Easy {
    static class Solution {

        public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
            ArrayList<Integer> res = new ArrayList<>();

            res.add(predecessor(root, key).data);
            res.add(successor(root, key).data);
            return res;
        }

        // [Optimal] TC: O(N), SC: O(1) - BST rule, store the node which is just greater than key val
        private static BinaryTreeNode<Integer> predecessor(BinaryTreeNode<Integer> root, int key) {
            BinaryTreeNode<Integer> predecessor = new BinaryTreeNode(-1);
            while (root != null) {
                if (key > root.data) {
                    predecessor = root;
                    root = root.right;
                } else
                    root = root.left;
            }
            return predecessor;
        }

        // [Optimal] TC: O(N), SC: O(1) - BST rule, store the node which is just lesser than key val
        private static BinaryTreeNode<Integer> successor(BinaryTreeNode<Integer> root, int key) {
            BinaryTreeNode<Integer> successor = new BinaryTreeNode(-1);
            while (root != null) {
                if (key >= root.data)
                    root = root.right;
                else {
                    successor = root;
                    root = root.left;
                }
            }
            return successor;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        BinaryTreeNode<Integer> root = BinaryTreeNode.toTree("15 10 20 8 12 16 25");

        int key = 10;
        Out.print(sol.predecessorSuccessor(root, key));
    }
}
