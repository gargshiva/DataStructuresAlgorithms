package com.gargshiva.tree.binarytree;


/**
 * Print path of a node from root
 * Find all the ancestors
 * Find all the management chain for a employee;
 */
public class PrintAncestors {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        printAncestors(binaryTree.createBinaryTree(), 2);
    }

    public static boolean printAncestors(TreeNode<Integer> root, int value) {
        if (root == null) {
            return false;
        }

        if (root.value == value) {
            System.out.println("Node => " + root.value);
            return true;
        }

        if (printAncestors(root.left, value) || printAncestors(root.right, value)) {
            System.out.println("Node => " + root.value);
            return true;
        }

        return false;
    }
}
