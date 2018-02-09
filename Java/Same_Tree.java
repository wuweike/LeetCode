/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        boolean isLeftSame = isSameTree(p.left, q.left);
        boolean isRightSame = isSameTree(p.right, q.right);
        
        if(isLeftSame && isRightSame && p.val == q.val){
            return true;
        }
        return false;
    }
}
