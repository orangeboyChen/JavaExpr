package com.nowcent.Expr1;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 10:40
 */
public class RecycleBin2 {
    private static volatile RecycleBin2 recycleBin2 = null;

    private RecycleBin2(){}

    public static RecycleBin2 getInstance(){
        if(recycleBin2 == null){
            synchronized (RecycleBin2.class){
                if(recycleBin2 == null){
                    recycleBin2 = new RecycleBin2();
                }
            }
        }

        return recycleBin2;
    }
}
