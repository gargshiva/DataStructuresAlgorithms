package com.gargshiva.tree.binarytree.traversal;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

import java.util.*;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        traverse(binaryTree.createBinaryTree());
    }

    public static void traverse(TreeNode<Integer> rootNode) {
        Map<Integer, List<TreeNode<Integer>>> table = new HashMap<Integer, List<TreeNode<Integer>>>();
        Queue<TreeNode<Integer>> elements = new LinkedList<TreeNode<Integer>>();
        Queue<Integer> hd = new LinkedList<Integer>();

        // RootNode
        List<TreeNode<Integer>> hdList = new ArrayList<TreeNode<Integer>>();
        hdList.add(rootNode);

        table.put(0, hdList);
        elements.add(rootNode);
        hd.add(0);


        while (!elements.isEmpty()) {
            TreeNode<Integer> node = elements.poll();
            Integer hDistance = hd.poll();

            if (node.left != null) {
                elements.add(node.left);
                int dist = hDistance - 1;
                hd.add(dist);
                if (table.get(dist) != null) {
                    List<TreeNode<Integer>> li = table.get(dist);
                    li.add(node.left);
                    table.put(dist, li);
                } else {
                    List<TreeNode<Integer>> li = new ArrayList<TreeNode<Integer>>();
                    li.add(node.left);
                    table.put(dist, li);
                }
            }

            if (node.right != null) {
                elements.add(node.right);
                int dist = hDistance + 1;
                hd.add(dist);
                if (table.get(dist) != null) {
                    List<TreeNode<Integer>> li = table.get(dist);
                    li.add(node.right);
                    table.put(dist, li);
                } else {
                    List<TreeNode<Integer>> li = new ArrayList<TreeNode<Integer>>();
                    li.add(node.right);
                    table.put(dist, li);
                }
            }

        }

        System.out.println(table);
    }


}
