package com.nowcent.Expr1;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 10:38
 */
public class RecycleBin1 {
    private static RecycleBin1 recycleBin1 = new RecycleBin1();
    private RecycleBin1(){}

    public static RecycleBin1 getInstance(){
        return recycleBin1;
    }
}
