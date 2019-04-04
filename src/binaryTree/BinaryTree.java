package binaryTree;

public class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static BinaryTree addNode(BinaryTree root, int value){
        if(root == null){
            return new BinaryTree(value, null, null);
        }

        BinaryTree curr = root, prev = root;

        while(curr != null){
            prev = curr;
            if(value <= curr.value){
                curr = curr.left;
            } else{
                curr = curr.right;
            }
        }
        if(value <= prev.value){
            prev.setLeft(new BinaryTree(value, null, null));
        }else{
            prev.setRight(new BinaryTree(value, null, null));
        }
        return root;
    }

    //left root right
    public static void inorderRecursive(BinaryTree root){
        if(root != null){
            inorderRecursive(root.getLeft());
            System.out.println(root.getValue());
            inorderRecursive(root.getRight());
        }
        return;

    }

    //left root right
    public static void inorderIterative(BinaryTree root){
        BinaryTree curr = root, prev = null;

        while(curr != null){
            prev = curr;
            //print if it's a leaf node
            if(curr.right == null & curr.left == null){
                System.out.println("node: " + curr.getValue());
            }
            curr = curr.getLeft();
        }
    }
}
