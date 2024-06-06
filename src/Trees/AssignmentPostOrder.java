package Trees;

import java.util.ArrayList;

public class AssignmentPostOrder {

    class Node {
        Node left ;
        Node right ;
        int data;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // Operation PostOrder
    static void postOrder(Node root, ArrayList<Integer>arr){
        if(root == null){
            return;
        }

        postOrder(root.left,arr);
        postOrder(root.right,arr);
        arr.add(root.data);
    }
    static void inOrder(Node root, ArrayList<Integer>arr) {
        if (root == null) {
            return;
        }

        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);

    }
    static void preOrder(Node root, ArrayList<Integer>arr) {
        if (root == null) {
            return;
        }

        arr.add(root.data);
        preOrder(root.left, arr);
        preOrder(root.right, arr);

    }


    public static void getValue (Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        postOrder(root , arr);
        System.out.println(arr.toString());
        preOrder(root,arr);
        inOrder(root,arr);
    }
}
