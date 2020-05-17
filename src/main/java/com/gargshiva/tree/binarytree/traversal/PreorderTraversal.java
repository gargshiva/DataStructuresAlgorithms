package com.gargshiva.tree.binarytree.traversal;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

import java.util.Stack;

public class PreorderTraversal {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        traverse(binaryTree.createBinaryTree());
        System.out.println();

        iterativeApproach(binaryTree.createBinaryTree());
        System.out.println();
    }

    /**
     * Recursive solution
     *
     * @param rootNode
     */
    public static void traverse(TreeNode<Integer> rootNode) {
        // base condition
        if (rootNode == null) return;

        // operation
        System.out.print(rootNode.value + " ");

        //sub problem
        traverse(rootNode.left);
        traverse(rootNode.right);
    }

    /**
     * Iterative approach
     *
     * @param rootNode
     */

    public static void iterativeApproach(TreeNode<Integer> rootNode) {
        Stack<TreeNode<Integer>> st = new Stack<TreeNode<Integer>>();
        while (true) {
            while (rootNode != null) {
                st.push(rootNode);
                System.out.print(rootNode + " ");
                rootNode = rootNode.left;
            }

            if (st.isEmpty()) {
                break;
            }
            TreeNode<Integer> node = st.pop();
            rootNode = node.right;

        }
    }

}
