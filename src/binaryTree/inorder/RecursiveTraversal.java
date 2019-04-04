package binaryTree.inorder;

import binaryTree.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveTraversal {

    private static ArrayList<Integer> inputList = new ArrayList(Arrays.asList(5,10,4, 100, 9,3,8,2,7,1,11,2,20,15));

    public static void main(String[] args) {

        BinaryTree root  = getTreeFromList(inputList);

        BinaryTree.inorderRecursive(root);
    }

    public static BinaryTree getTreeFromList(ArrayList<Integer> inputList){
        BinaryTree root  = null;
        for( int input : inputList){
            root = BinaryTree.addNode(root, input);
        }
        return root;
    }

    public static void inorderRecursive(){
        BinaryTree root  = getTreeFromList(inputList);
        BinaryTree.inorderRecursive(root);
    }
}
