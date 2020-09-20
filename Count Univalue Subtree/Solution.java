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
class Solution 
{
    int count = 0;
    boolean isValid(TreeNode node, int val)
    {
        // Check if the tree is a valid subtree
        if(node == null)
            return true;
        
        // Check left & right node are univalue subtrees of val
        // Exploring possible routes 
        if(!isValid(node.left,node.val) | !isValid(node.right,node.val))
            return false;
        
        //If last step is passed, then it is a valid subtree - increment
        count++;
        
        // We know the node is a univalue subtree of value
        return node.val == val;
    }
    public int countUnivalSubtrees(TreeNode root) 
    {
        isValid(root,0);
        return count;
    }
}
