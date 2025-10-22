package ADI_CLASS.Trees;

public class CreateBST {

    public static  Node insert (Node root, int val){
        if (root== null) return new Node(val);
        if (val<= root.data)   root.left =insert(root.left,val);
        if (val> root.data)    root.right =insert(root.right,val);
        return root;
    }

    public static void print (Node root){
        if (root==null)  return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

    static void main(String[] args){
        Node root = null;
        int[] arr={45,6,3,76,3,6,2,6,2,8,2};
        for (int val: arr){
            root = insert (root, val);
        }
        print(root);
    }
}