package ADI_CLASS.Trees;

class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data = val;
        left=right=null;
    }
}

public class TreeTraversal {

    static void printTree(Node root){
        if(root == null) return;
        printTree(root.left);
        printTree(root.right);
        System.out.print(root.data+" ");
    }

    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        printTree(root);
    }
}
//Preorder root-left-right
//Postorder left-right-root
//Inorder left-root-right