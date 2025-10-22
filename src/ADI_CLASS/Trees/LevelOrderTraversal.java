package ADI_CLASS.Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                q.offer(current.left);
            }
            if (current.right != null) {
                q.offer(current.right);
            }
        }
    }

    static Node buildTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes of the tree : ");
        int num = sc.nextInt();
        System.out.println("Enter the values of nodes and enter -1 for null : ");
        int val = sc.nextInt();
        Node root = new Node(val);
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        for(int i = 1; i<num; i++){
            Node current = q.poll();
            int leftVal = sc.nextInt();
            if(leftVal!=-1){
                current.left = new Node(leftVal);
                q.offer(current.left);
            }
            int rightVal = sc.nextInt();
            if(rightVal!=-1){
                current.right = new Node(rightVal);
                q.offer(current.right);
            }
        }
        return root;
    }

    static void main(String[] args) {
        Node root = buildTree();
        printTree(root);
    }
}
