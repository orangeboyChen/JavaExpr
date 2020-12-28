package com.nowcent.Expr3;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/28 10:10
 */
public class Expr3Test {
    public static void test(){
        System.out.println("\n====实验3====");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        System.out.println("在索引为5的位置添加20个元素");
        for (int i = 0; i < 20; i++) {
            list.listInsert(5, i);
        }
        list.showList();

        System.out.println("在索引为0的位置删除10个元素");
        for (int i = 0; i < 10; i++) {
            list.listDelete(0);
        }
        list.showList();

        System.out.println("获取头部元素");
        System.out.println(list.getHead());

        System.out.println("清除列表");
        list.clearList();
        list.showList();
    }

}
