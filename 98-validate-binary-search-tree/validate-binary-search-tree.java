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
    TreeNode previousNode;
    public boolean isValidBST(TreeNode root) {
    return inOrderTraversal(root);
    }
    boolean inOrderTraversal(TreeNode CurrentNode){
        if(CurrentNode==null){
            return true;
        }
        if(!inOrderTraversal(CurrentNode.left)){
            return false;
        }
        if(previousNode!=null && previousNode.val>=CurrentNode.val){
            return false;
        }
        previousNode=CurrentNode;
        return inOrderTraversal(CurrentNode.right);

    }

}