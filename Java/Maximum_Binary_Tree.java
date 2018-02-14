/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Maximum_Binary_Tree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(0, nums.length - 1, nums);
    }
    
    private TreeNode buildTree(int startIndex, int endIndex, int[] nums){
        if(nums.length == 0 || startIndex > endIndex){
            return null;
        }
        if(startIndex == endIndex){
            return new TreeNode(nums[startIndex]);
        }
        int maxIndex = findMax(startIndex, endIndex, nums);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = buildTree(startIndex, maxIndex - 1, nums);
        root.right = buildTree(maxIndex + 1, endIndex, nums);
        return root;
    }
    
    private int findMax(int startIndex, int endIndex, int[] nums){
        int result = startIndex;
        for(int i = startIndex; i <= endIndex; i++){
            result = nums[result] > nums[i] ? result : i;
        }
        return result;
    }
}
