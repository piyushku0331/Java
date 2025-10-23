package TreePractice.IterativeTreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostorder {
    public static List<Integer> postorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node!=null || !stack.isEmpty()){
            if(node!=null){
                stack.push(node);
                node=node.leftChild;
            }
            else{
                TreeNode temp = stack.peek().rightChild;
                if(temp == null){
                    do {
                        temp = stack.peek();
                        stack.pop();
                        result.add(temp.data);
                    } while (!stack.isEmpty() && temp == stack.peek().rightChild);
                }
                else{
                    node = temp;
                }
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
        System.out.println(postorder(root));
    }
}