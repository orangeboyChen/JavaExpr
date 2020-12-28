package com.nowcent.Expr1;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 10:34
 */
public class Temp {

    {
        System.out.println("init block");
    }

    public Temp(int x, int y){
        this(5);
        System.out.println(x * y);
    }

    public Temp(int x){
        this();
        System.out.println(x);
    }

    public Temp(){
        System.out.println("default");
    }

}
