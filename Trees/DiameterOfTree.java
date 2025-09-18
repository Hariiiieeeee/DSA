public /*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int dfsHeight(Node root, int[] diameter){
        if(root == null) return 0;
        
        int[] lh = new int[1];
        lh[0] = dfsHeight(root.left, diameter);
        
        int[] rh = new int[1];
        rh[0] = dfsHeight(root.right, diameter);
        
        diameter[0] = Math.max(diameter[0], lh[0] + rh[0]);
        
        return 1 + Math.max(lh[0], rh[0]);
    }
    
    int diameter(Node root) {
        int[] n = new int[1];
        int x = dfsHeight(root, n);
        return n[0];
    }
} {
    
}
