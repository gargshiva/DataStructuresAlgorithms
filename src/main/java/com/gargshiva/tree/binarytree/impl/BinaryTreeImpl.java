package com.gargshiva.tree.binarytree.impl;

public class BinaryTreeImpl {

    public TreeNode<Integer> createBinaryTree() {
        TreeNode<Integer> rootNode = new TreeNode<Integer>(1);

        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(4);
        TreeNode<Integer> node4 = new TreeNode<Integer>(5);
        TreeNode<Integer> node5 = new TreeNode<Integer>(6);
        TreeNode<Integer> node6 = new TreeNode<Integer>(7);
        TreeNode<Integer> node7 = new TreeNode<Integer>(8);
        TreeNode<Integer> node8 = new TreeNode<Integer>(9);
        TreeNode<Integer> node9 = new TreeNode<Integer>(100);


        rootNode.left = node1;
        rootNode.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node4.left = node7;
        node4.right = node8;

        node8.right = node9;

        return rootNode;
    }
}
