package com.xmc.tree.binaryTree;

/**
 * Created by xmc1993 on 16/10/26.
 */

/**
 * 二叉树节点
 */
public class TreeNode {
    private int value;
    private TreeNode leftChildNode;
    private TreeNode rightChildNode;

    public TreeNode(){

    }

    public TreeNode(int value, TreeNode leftChildNode, TreeNode rightChildNode){
        this.value = value;
        this.leftChildNode = leftChildNode;
        this.rightChildNode = rightChildNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChildNode() {
        return leftChildNode;
    }

    public void setLeftChildNode(TreeNode leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public TreeNode getRightChildNode() {
        return rightChildNode;
    }

    public void setRightChildNode(TreeNode rightChildNode) {
        this.rightChildNode = rightChildNode;
    }
}
