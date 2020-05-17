package com.gargshiva.tree.binarytree.view;

import com.gargshiva.tree.binarytree.impl.BinaryTreeImpl;
import com.gargshiva.tree.binarytree.impl.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopView {
    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        topView(binaryTree.createBinaryTree());
    }
    public static void topView(TreeNode<Integer> rootNode) {
        Map<Integer, TreeNode<Integer>> table = new HashMap<Integer, TreeNode<Integer>>();
        Queue<TreeNode<Integer>> elements = new LinkedList<TreeNode<Integer>>();
        Queue<Integer> hd = new LinkedList<Integer>();

        // RootNode
        table.put(0, rootNode);
        elements.add(rootNode);
        hd.add(0);


        while (!elements.isEmpty()) {
            TreeNode<Integer> node = elements.poll();
            Integer hDistance = hd.poll();

            if (node.left != null) {
                elements.add(node.left);
                int dist = hDistance - 1;
                hd.add(dist);
                if(table.get(dist) == null){
                    table.put(dist, node.left);
                }

            }

            if (node.right != null) {
                elements.add(node.right);
                int dist = hDistance + 1;
                hd.add(dist);
                if(table.get(dist) == null){
                    table.put(dist, node.right);
                }
            }

        }

        System.out.println(table);
    }
}
