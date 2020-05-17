package com.gargshiva.tree.binarytree;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RootLeafPath {

    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        printRootLeafPath(binaryTree.createBinaryTree(), new ArrayList<Integer>());
    }

    public static void printRootLeafPath(TreeNode<Integer> rootNode, List<Integer> path) {

        if (rootNode == null) {
            return;
        }

        path.add(rootNode.value);

        if (rootNode.left == null && rootNode.right == null) {
            System.out.println("Path => " + path);
        } else {

            printRootLeafPath(rootNode.left, path);
            printRootLeafPath(rootNode.right, path);
        }

        path.remove(rootNode.value);

    }
}
