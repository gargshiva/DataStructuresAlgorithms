package com.gargshiva.tree.binarytree;

/**
 * Add one element for each level . One other possible solution can be Level order traversal.
 */
public class LeftSideView {
    static int cnt = -1;

    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        printLeftSide(binaryTree.createBinaryTree(), 0);
    }

    public static void printLeftSide(TreeNode<Integer> root, int depth) {
        if (root == null) {
            return;
        }

        if (cnt < depth) {
            System.out.println("Element => " + root.value);
            ++cnt;
        }

        printLeftSide(root.left, depth + 1);
        printLeftSide(root.right, depth + 1);
    }
}
