package com.xmc.jianzhiOffer;

import com.xmc.tree.binaryTree.BinaryTree;
import com.xmc.tree.binaryTree.BinaryTreeTest;
import com.xmc.tree.binaryTree.TreeNode;

/**
 * 二叉树的镜像
 * Created by xmc1993 on 2017/7/4.
 */
public class Q19 {

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeTest.generateTestTree();
        binaryTree.print();
        BinaryTree binaryTree1 = mirrorTree(binaryTree);
        binaryTree1.print();
    }

    public static BinaryTree mirrorTree(BinaryTree binaryTree) {
        mirrorTree(binaryTree.getRootTreeNode());
        return binaryTree;
    }

    public static void mirrorTree(TreeNode treeNode){
        TreeNode leftChildNode = treeNode.getLeftChildNode();
        TreeNode rightChildNode = treeNode.getRightChildNode();
        if (leftChildNode != null) {
            treeNode.setRightChildNode(leftChildNode);
            mirrorTree(leftChildNode);
        }
        if (rightChildNode != null) {
            treeNode.setLeftChildNode(rightChildNode);
            mirrorTree(rightChildNode);
        }

    }
}
