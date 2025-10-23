package TreePractice.IterativeTreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair {
    TreeNode node;
    int num;
    Pair(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class AllInOneTraversal {
    public static void oneTraversals(TreeNode root){
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        if(root == null) return;
        stack.push(new Pair(root, 1));
        while(!stack.isEmpty()){
            Pair it = stack.pop();
            if(it.num==1){
                preorder.add(it.node.data);
                it.num++;
                stack.push(it);
                if(it.node.leftChild!=null) stack.push(new Pair(it.node.leftChild,1));
            }
            else if(it.num==2){
                inorder.add(it.node.data);
                it.num++;
                stack.push(it);
                if(it.node.rightChild!=null) stack.push(new Pair(it.node.rightChild,1));
            }
            else{
                postorder.add(it.node.data);
            }
        }
        System.out.println(inorder);
        System.out.println(preorder);
        System.out.println(postorder);
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.leftChild = new TreeNode(2);
        root.rightChild = new TreeNode(3);
        root.leftChild.leftChild = new TreeNode(4);
        root.leftChild.rightChild = new TreeNode(5);
        root.rightChild.leftChild = new TreeNode(6);
        root.rightChild.rightChild = new TreeNode(7);
        oneTraversals(root);
    }
}
