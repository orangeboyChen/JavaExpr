package com.nowcent.Expr3;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/26 15:21
 */
public interface LinkedList<T> {
    /**
     * 是否为空表
     * @return 是否为空表
     */
    boolean listEmpty();

    /**
     * 获取元素个数
     * @return 元素个数
     */
    int listLength();

    /**
     * 获取第i个元素
     * @param index 索引
     * @return 第i个元素
     */
    T getElement(int index);

    /**
     * 获取目标元素的索引号
     * @param e 需要查找的元素
     * @return 元素索引号
     */
    int locateElem(T e);

    /**
     * 在第i个元素后添加新的元素
     * @param index 索引
     * @param e 需要添加的元素
     */
    void listInsert(int index, T e);

    /**
     * 删除元素
     * @param index 索引
     * @return 删除的元素
     */
    T listDelete(int index);

    /**
     * 更新元素
     * @param index 索引
     * @param e 更新后的元素
     */
    void listUpdate(int index, T e);

    /**
     * 清除列表中所有元素
     */
    void clearList();



}
