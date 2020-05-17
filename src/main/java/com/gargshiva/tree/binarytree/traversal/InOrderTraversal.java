package com.gargshiva.tree.binarytree.traversal;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

import java.util.Stack;

public class InOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        traverse(binaryTree.createBinaryTree());
        System.out.println();

        iterativeApproach(binaryTree.createBinaryTree());
    }

    public static void traverse(TreeNode<Integer> rootNode) {
        // base condition
        if (rootNode == null) return;

        //sub-problem
        traverse(rootNode.left);
        //operation
        System.out.print(rootNode.value + " ");
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
                rootNode = rootNode.left;
            }

            if (st.isEmpty()) {
                break;
            }
            TreeNode<Integer> node = st.pop();
            System.out.print(node + " ");
            rootNode = node.right;

        }
    }
}
