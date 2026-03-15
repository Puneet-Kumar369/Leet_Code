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
        //inorder traversal-get the issued notes
        //go to the left most->recursive
        //previous node value>current node value
        //
 *     }
 * }
 */
class Solution {
    TreeNode PreviousNode,FirstNode,SecondNode;
    public void recoverTree(TreeNode root) {
        inOrderTraversal(root);
        int temp=FirstNode.val;
        FirstNode.val=SecondNode.val;
        SecondNode.val=temp;
    }
    void inOrderTraversal(TreeNode CurrentNode){
        if(CurrentNode==null){
            return;
        }
        inOrderTraversal(CurrentNode.left);
        if(PreviousNode!=null && PreviousNode.val>CurrentNode.val){
            if(FirstNode==null){
                FirstNode=PreviousNode;
            }
            SecondNode=CurrentNode;
        }
        PreviousNode=CurrentNode;
        inOrderTraversal(CurrentNode.right);

    }
}