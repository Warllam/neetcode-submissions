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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        Deque<Object[]> queue = new ArrayDeque<>();
        queue.offer(new Object[]{root, Integer.MIN_VALUE, Integer.MAX_VALUE});

        while(!queue.isEmpty()){

            Object[] current = queue.poll();
            TreeNode node = (TreeNode) current[0];

            int min = (int) current[1];
            int max = (int) current[2];

            if(min >= node.val || max <= node.val) return false;

            if(node.left != null){
                queue.offer(new Object[]{node.left, min, node.val});
            }

            if(node.right != null){
                queue.offer(new Object[]{node.right, node.val, max});
            }
        }


        return true;
    }
}
