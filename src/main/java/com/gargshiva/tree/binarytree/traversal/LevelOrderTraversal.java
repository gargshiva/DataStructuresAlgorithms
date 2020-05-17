package com.gargshiva.tree.binarytree.traversal;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Breadth First Search (BFS)
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        levelOrderTraverse_Iterative(binaryTree.createBinaryTree());
        System.out.println();
        levelOrderTraverse_Recursive(binaryTree.createBinaryTree());

    }

    /**
     * Level Order traversal - Iterative approach using the Queue.
     *
     * @param rootNode
     */
    public static void levelOrderTraverse_Iterative(TreeNode<Integer> rootNode) {
        Queue<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
        queue.add(rootNode);

        while (!queue.isEmpty()) {
            TreeNode<Integer> node = queue.poll();
            System.out.print("" + node.value + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    /**
     * Level Order traversal - Recursive approach.
     * Find height
     * Print node at each level.
     *
     * @param rootNode
     */
    public static void levelOrderTraverse_Recursive(TreeNode<Integer> rootNode) {
        int height = height(rootNode, 0);
        for (int i = 0; i <= height; ++i) {
            printNodesAtLevel(rootNode, i);
            System.out.println();
        }
    }


    public static int height(TreeNode<Integer> rootNode, int height) {
        if (rootNode == null) {
            return height - 1;
        }

        int leftHeight = height(rootNode.left, height + 1);
        int rightHeight = height(rootNode.right, height + 1);

        if (leftHeight > rightHeight) {
            return leftHeight;
        } else
            return rightHeight;
    }

    public static void printNodesAtLevel(TreeNode<Integer> rootNode, int level) {
        if (rootNode == null) return;

        if (level == 0) {
            System.out.print(rootNode.value + " ");
        }

        printNodesAtLevel(rootNode.left, level - 1);
        printNodesAtLevel(rootNode.right, level - 1);
    }
}
