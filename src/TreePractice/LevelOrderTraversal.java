package TreePractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    static List<List<Integer>> traversal(TreeNode root){
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subRes = new ArrayList<>();
            for(int i = 0; i<levelNum; i++){
                TreeNode Node = queue.poll();
                subRes.add(Node.data);
                if(Node.left!=null) queue.offer(Node.left);
                if(Node.right!=null) queue.offer(Node.right);
            }
            res.add(subRes);
        }
        return res;
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("The Level Order Traversal of the tree is "+traversal(root));
    }
}
