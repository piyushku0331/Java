package TreePractice.IterativeTreeTraversal;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;
    public TreeNode(int data){
        this.data=data;
        leftChild=rightChild=null;
    }
}

public class IterativePreorder {
    public static List<Integer> preorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null) return result;
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            result.add(root.data);
            if(root.rightChild!=null) stack.push(root.rightChild);
            if(root.leftChild!=null) stack.push(root.leftChild);
        }
        return result;
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.leftChild = new TreeNode(2);
        root.rightChild = new TreeNode(3);
        root.leftChild.leftChild = new TreeNode(4);
        root.leftChild.rightChild = new TreeNode(5);
        root.rightChild.leftChild = new TreeNode(6);
        root.rightChild.rightChild = new TreeNode(7);
        System.out.println(preorder(root));
    }
}
