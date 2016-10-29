package com.xmc.tree.binaryTree;

/**
 * Created by xmc1993 on 16/10/26.
 */
public class BinaryTreeTest {

    private static BinaryTree binaryTree;

    public static void main(String[] args) {

        leftTraversal(generateTestTree().getRootTreeNode());//左
        System.out.println("");
        midTraversal(generateTestTree().getRootTreeNode());//中
        System.out.println("");
        rightTraversal(generateTestTree().getRootTreeNode());//右
        System.out.println("");

        System.out.println("----------------------------");
        leftTraversal(getTreeFromLeftAndMid().getRootTreeNode());
        System.out.println("");
        midTraversal(getTreeFromLeftAndMid().getRootTreeNode());
    }

    public static BinaryTree generateTestTree() {
        if (binaryTree != null) {
            return binaryTree;
        }
        TreeNode treeNode = new TreeNode(9, null, null);
        TreeNode treeNode1 = new TreeNode(8, null, null);
        TreeNode treeNode2 = new TreeNode(7, null, null);
        TreeNode treeNode3 = new TreeNode(6, null, null);
        TreeNode treeNode4 = new TreeNode(5, null, null);
        TreeNode treeNode5 = new TreeNode(4, treeNode1, treeNode);
        TreeNode treeNode6 = new TreeNode(3, treeNode3, treeNode2);
        TreeNode treeNode7 = new TreeNode(2, treeNode5, treeNode4);
        TreeNode treeNode8 = new TreeNode(1, treeNode7, treeNode6);
        binaryTree = new BinaryTree(treeNode8);

        return binaryTree;
    }

    /**
     * 二叉树前序遍历
     *
     * @param rootNode 树的根节点
     */
    public static void leftTraversal(TreeNode rootNode) {
        if (rootNode == null) return;
        System.out.print(rootNode.getValue() + "->");
        if (rootNode.getLeftChildNode() != null) leftTraversal(rootNode.getLeftChildNode());
        if (rootNode.getRightChildNode() != null) leftTraversal(rootNode.getRightChildNode());

    }

    /**
     * 二叉树中序遍历
     *
     * @param rootNode
     */
    public static void midTraversal(TreeNode rootNode) {
        if (rootNode == null) return;
        if (rootNode.getLeftChildNode() != null) midTraversal(rootNode.getLeftChildNode());
        System.out.print(rootNode.getValue() + "->");
        if (rootNode.getRightChildNode() != null) midTraversal(rootNode.getRightChildNode());

    }

    /**
     * 二叉树后序遍历
     *
     * @param rootNode
     */
    public static void rightTraversal(TreeNode rootNode) {
        if (rootNode == null) return;
        if (rootNode.getLeftChildNode() != null) rightTraversal(rootNode.getLeftChildNode());
        if (rootNode.getRightChildNode() != null) rightTraversal(rootNode.getRightChildNode());
        System.out.print(rootNode.getValue() + "->");

    }

    public static BinaryTree getTreeFromLeftAndMid(){
        int[] left = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int[] mid = {8, 4, 9, 2, 5, 1, 6, 3, 7};
        return new BinaryTree(fromLeftAndMid(left, 0, 8, mid, 0, 8));
    }

    public static TreeNode fromLeftAndMid(int[] left, int ll, int lr, int[] mid, int ml, int mr) {
        if (ll == lr) return new TreeNode(left[ll], null, null);  //如果到叶节点了
        int value = left[ll];
        TreeNode treeNode = new TreeNode(value, null, null); //新的子树的节点
        int mPtr = ml;
        while(mid[mPtr] != value) mPtr++;
        ll++; //left[ll]节点已经消费了
        int lPtr = ll + (mPtr - ml);
        treeNode.setLeftChildNode(fromLeftAndMid(left, ll, lPtr-1, mid, ml, mPtr-1));
        treeNode.setRightChildNode(fromLeftAndMid(left, lPtr, lr, mid, mPtr+1, mr));
        return treeNode;
    }

}
