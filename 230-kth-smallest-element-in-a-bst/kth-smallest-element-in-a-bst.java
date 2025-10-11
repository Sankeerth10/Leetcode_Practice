/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public int kthSmallest(TreeNode root, int k) {
    //     List<Integer> list = new ArrayList<>();
    //     dfs(root, list);
    //     Collections.sort(list);
    //     return list.get(k-1);
    // }

    // void dfs(TreeNode node, List<Integer> list) {
    //     list.add(node.val);
    //     if (node.left != null) {
    //         dfs(node.left, list);
    //     }
    //     if (node.right != null) {
    //         dfs(node.right, list);
    //     }

    //     return;
    // }

    int count = 0;
    TreeNode result = null;
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return result.val;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if(node == null) {
            return;
        }

        inorderTraversal(node.left, k);
        count++;
        if(count == k) {
            result = node;
            return;
        }
        inorderTraversal(node.right, k);
    }
}