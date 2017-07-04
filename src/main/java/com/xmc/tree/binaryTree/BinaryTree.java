package com.xmc.tree.binaryTree;

import java.util.Queue;
import java.util.LinkedList;


/**
 * Created by xmc1993 on 16/10/26.
 */
public class BinaryTree {
    private TreeNode rootTreeNode;

    private BinaryTree() {

    }

    public BinaryTree(TreeNode rootTreeNode) {
        this.rootTreeNode = rootTreeNode;
    }

    public TreeNode getRootTreeNode() {
        return rootTreeNode;
    }

    public void setRootTreeNode(TreeNode rootTreeNode) {
        this.rootTreeNode = rootTreeNode;
    }

    public void print() {
        if (rootTreeNode == null) {
            System.out.println("空树");
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.add(rootTreeNode);
        while (!queue.isEmpty()) {
            TreeNode pop = queue.poll();
            System.out.print(pop.getValue() + "-");
            if (pop.getLeftChildNode() != null) {
                queue.add(pop.getLeftChildNode());
            }
            if (pop.getRightChildNode() != null) {
                queue.add(pop.getRightChildNode());
            }
        }

        System.out.println("");
    }
}
