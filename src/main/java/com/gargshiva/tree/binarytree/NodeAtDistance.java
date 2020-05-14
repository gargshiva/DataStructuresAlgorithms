package com.gargshiva.tree.binarytree;

/**
 * Print nodes at distance k
 */
public class NodeAtDistance {

    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        printNodes(binaryTree.createBinaryTree(), 0, 0);
        printNodes(binaryTree.createBinaryTree(), 0, 1);
        printNodes(binaryTree.createBinaryTree(), 0, 2);
        printNodes(binaryTree.createBinaryTree(), 0, 3);

    }

    public static void printNodes(TreeNode<Integer> root, int distance, int k) {
        // Base condition for recursion;
        if (root == null || distance > k) {
            return;
        }

        if (distance == k) {
            System.out.println("Node Value => " + root.value + " , Distance from root = " + distance);
        }
        printNodes(root.left, distance + 1, k);
        printNodes(root.right, distance + 1, k);

    }
}
