package com.xmc.tree.binaryTree;

/**
 * Created by xmc1993 on 16/10/26.
 */
public class BinaryTree {
    private TreeNode rootTreeNode;

    public BinaryTree(){

    }

    public BinaryTree(TreeNode rootTreeNode){
        this.rootTreeNode = rootTreeNode;
    }

    public TreeNode getRootTreeNode() {
        return rootTreeNode;
    }

    public void setRootTreeNode(TreeNode rootTreeNode) {
        this.rootTreeNode = rootTreeNode;
    }
}
