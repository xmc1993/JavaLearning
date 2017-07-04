package com.xmc.jianzhiOffer;

import com.xmc.tree.binaryTree.BinaryTree;
import com.xmc.tree.binaryTree.BinaryTreeTest;
import com.xmc.tree.binaryTree.TreeNode;

/**
 * 二叉搜索树与双向链表
 * ez 使用递归思想
 * <p>
 * Created by xmc1993 on 2017/7/4.
 */
public class Q27 {


    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeTest.generateSearchTree();
        TreeNode treeNode = tree2list(binaryTree);

        do {
            System.out.print(treeNode.getValue() + "-");
            treeNode = treeNode.getRightChildNode();
        }while (treeNode != null);
        System.out.println("");
    }

    public static TreeNode tree2list(BinaryTree binaryTree) {
        return tree2list(binaryTree.getRootTreeNode());
    }

    public static TreeNode tree2list(TreeNode treeNode) {
        TreeNode leftChildNode = treeNode.getLeftChildNode();
        TreeNode rightChildNode = treeNode.getRightChildNode();
        TreeNode headNode;
        if (leftChildNode != null) {
            TreeNode treeNode1 = tree2list(leftChildNode);
            headNode = treeNode1;
            while (treeNode1.getRightChildNode() != null) {
                treeNode1 = treeNode1.getRightChildNode();
            }
            treeNode1.setRightChildNode(treeNode);
            treeNode.setLeftChildNode(treeNode1);
        } else {
            treeNode.setLeftChildNode(null);
            headNode = treeNode;
        }

        if (rightChildNode != null) {
            TreeNode treeNode1 = tree2list(rightChildNode);
            treeNode1.setLeftChildNode(treeNode);
            treeNode.setRightChildNode(treeNode1);
        } else {
            treeNode.setRightChildNode(null);
        }

        return headNode;
    }
}
