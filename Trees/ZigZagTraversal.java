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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean back = false;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode node = q.poll();

                if(back) list.addFirst(node.val);
                else list.addLast(node.val);

                if(node.left != null) q.add(node.left);

                if(node.right != null) q.add(node.right);
            }

            back = !back;
            res.add(list);
        }

        return res;
    }
}