/*
Leetcode #938

Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
The binary search tree is guaranteed to have unique values.

Example 1:
Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23

@author ketanmalik
May 19 2020
*/

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


public class LC938 {
	    int res;
	    public int rangeSumBST(TreeNode root, int L, int R) {
	        res = 0;
	        recTree(root, L, R);
	        return res;
	    }
	    public void recTree(TreeNode root, int L, int R){
	        if(root == null) return;
	        if(root.val >= L && root.val <= R) res += root.val;
	        recTree(root.left, L, R);
	        recTree(root.right, L, R);
	    }
}
