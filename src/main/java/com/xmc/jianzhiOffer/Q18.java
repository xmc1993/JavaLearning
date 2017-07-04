package com.xmc.jianzhiOffer;

import com.xmc.tree.binaryTree.BinaryTree;
import com.xmc.tree.binaryTree.BinaryTreeTest;
import com.xmc.tree.binaryTree.TreeNode;

/**
 *
 * 树的子结构
 *
 * TODO 有bug需要继续调整
 * Created by xmc1993 on 2017/7/4.
 */
public class Q18 {

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeTest.generateSubTestTree();
        BinaryTree binaryTree1 = BinaryTreeTest.generateSubTestTree();
        System.out.println(isSubTree(binaryTree, binaryTree1));
    }

    public static boolean isSubTree(BinaryTree parentTree, BinaryTree subTree) {
        return isSubTree(parentTree.getRootTreeNode(), subTree.getRootTreeNode());
    }

    public static boolean isSubTree(TreeNode parentTree, TreeNode subTree) {
        if (isCurSub(parentTree, subTree)) {
            return true;
        }
        return isCurSub(parentTree.getLeftChildNode(), subTree) || isCurSub(parentTree.getRightChildNode(), subTree);
    }

    public static boolean isCurSub(TreeNode pNode, TreeNode sNode){
        if (sNode == null) {
            return true;
        }
        if (pNode == null) {
            return false;
        }
        if (pNode.getValue() != sNode.getValue()) {
            return false;
        }
        return (isCurSub(pNode.getLeftChildNode(), sNode.getLeftChildNode())
                && isCurSub(pNode.getRightChildNode(), sNode.getRightChildNode()));
    }


}
