package TreePractice.IterativeTreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {
    public static List<Integer> inorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                stack.push(node);
                node = node.leftChild;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                result.add(node.data);
                node=node.rightChild;
            }
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
        System.out.println(inorder(root));
    }
}
