import java.util.LinkedList;
import java.util.Queue;

public class DeptOfTree {
    public int depth(Node root){
        if(root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                Node node = q.poll();

                if(node.left != null) q.add(node.left);

                if(node.right != null) q.add(node.right);
            }

            level++;
        }

        return level;
    }
}
