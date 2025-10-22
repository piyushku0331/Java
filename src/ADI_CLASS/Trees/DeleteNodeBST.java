package ADI_CLASS.Trees;

public class DeleteNodeBST {
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val <= root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }
    // Print inorder traversal of the BST
    public static void print(Node root) {
        if (root == null) return;
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }
    // Find minimum node in a subtree
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    // Delete a node from the BST
    public static Node remove(Node root, int val) {
        if (root == null) return null;
        if (val < root.data) {
            root.left = remove(root.left, val);
        } else if (val > root.data) {
            root.right = remove(root.right, val);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            else {
                Node temp = findMin(root.right);
                root.data = temp.data;
                root.right = remove(root.right, temp.data);
            }
        }
        return root;
    }
    static void main(String[] args) {
        Node root = null;
        int[] arr = {45, 6, 3, 76, 3, 6, 2, 6, 2, 8, 2};
        for (int val : arr) {
            root = insert(root, val);
        }
        System.out.println("BST before deletion:");
        print(root);
        root = remove(root, 8);
        System.out.println("\nBST after deleting 8:");
        print(root);
    }
}