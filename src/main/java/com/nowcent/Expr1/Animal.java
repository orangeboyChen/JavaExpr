package com.nowcent.Expr1;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 10:47
 */
public abstract class Animal {
    private String name;
    public String getName(){
        return name;
    }
    public Animal(String theName){
        name = theName;
    }
}

