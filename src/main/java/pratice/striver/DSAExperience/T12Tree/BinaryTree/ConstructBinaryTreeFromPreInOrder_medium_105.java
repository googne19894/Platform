package pratice.striver.DSAExperience.T12Tree.BinaryTree;

import pratice.common.Out;
import pratice.striver.DSAExperience.T12Tree.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreInOrder_medium_105 {
    static class Solution {
        // [Optimal] TC: O(n), O(n) - assign index for each node. preorder first element must be its root element
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            Map<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i < inorder.length; i++)
                index.put(inorder[i], i);

            return buildTree(preorder, 0, preorder.length - 1,
                    inorder, 0, inorder.length - 1, index);
        }

        private TreeNode buildTree(int[] preorder, int preStart, int preEnd,
                                   int[] inorder, int inStart, int inEnd,
                                   Map<Integer, Integer> index) {
            if (preStart > preEnd || inStart > inEnd) return null;

            TreeNode root = new TreeNode(preorder[preStart]);
            int inRoot = index.get(root.val);
            int numsLen = inRoot - inStart;

            root.left = buildTree(preorder, preStart + 1, preStart + numsLen,
                    inorder, inStart, inRoot - 1, index);
            root.right = buildTree(preorder, preStart + numsLen + 1, preEnd,
                    inorder, inRoot + 1, inEnd, index);

            return root;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] inorder = {40, 20, 50, 10, 60, 30};
        int[] preorder = {10, 20, 40, 50, 30, 60};
        Out.print(sol.buildTree(preorder, inorder));
    }
}
