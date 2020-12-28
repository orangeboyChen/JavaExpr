package com.nowcent.Expr4;

import java.util.Arrays;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/28 10:13
 */
public class Expr4Test {
    public static void test(){
        System.out.println("\n====实验4====");
        Integer[] data = new Integer[]{10, 12, 6, 15, 11, 7, 3};
        BTree<Integer> bTree = new BTree<>();
        System.out.println("添加元素 " + Arrays.toString(data));
        bTree.createBTree(data);

        System.out.println("前序遍历为 " + bTree.preOrder());
        System.out.println("中序遍历为 " + bTree.inOrder());
        System.out.println("后序遍历为 " + bTree.postOrder());
        System.out.println("层级遍历为 " + bTree.levelOrder());
        System.out.println("寻找12的节点 " + bTree.findNode(12));
        System.out.println("树的高度为 " + bTree.getBTHeight());

    }
}
