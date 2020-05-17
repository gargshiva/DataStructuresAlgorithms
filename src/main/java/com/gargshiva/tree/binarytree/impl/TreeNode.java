package com.gargshiva.tree.binarytree.impl;

public class TreeNode<T> {
    public T value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value+"";
    }
}
