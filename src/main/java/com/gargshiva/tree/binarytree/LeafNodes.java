package com.gargshiva.tree.binarytree;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

public class LeafNodes {

    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        printLeafNodes(binaryTree.createBinaryTree());
    }

    public static void printLeafNodes(TreeNode<Integer> rootNode) {
        if (rootNode == null) {
            return;
        }

        // Operation : Check current node is leaf or not ?
        if (rootNode.left == null && rootNode.right == null) {
            System.out.println("Leaf Node => " + rootNode.value);
        }

        printLeafNodes(rootNode.left);
        printLeafNodes(rootNode.right);
    }
}
