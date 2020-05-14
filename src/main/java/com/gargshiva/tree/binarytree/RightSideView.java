package com.gargshiva.tree.binarytree;

public class RightSideView {

    static int cnt = -1;

    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        printRightSide(binaryTree.createBinaryTree(), 0);
    }

    public static void printRightSide(TreeNode<Integer> root, int depth) {
        if (root == null) {
            return;
        }

        if (cnt < depth) {
            System.out.println("Element => " + root.value);
            ++cnt;
        }

        printRightSide(root.right, depth + 1);
        printRightSide(root.left, depth + 1);

    }
}
