package com.gargshiva.tree.binarytree;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

/**
 * Calculate the salary of all employees
 */
public class SumTree {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        System.out.println(sum(binaryTree.createBinaryTree()));
    }

    public static int sum(TreeNode<Integer> rootNode) {
        if (rootNode == null) {
            return 0;
        }

        return rootNode.value + sum(rootNode.left) + sum(rootNode.right);
    }
}
