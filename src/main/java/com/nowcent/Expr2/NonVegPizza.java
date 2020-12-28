package com.nowcent.Expr2;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 15:58
 */
public class NonVegPizza extends Pizza{

    public NonVegPizza(){
        description = "None vegetable";
        cost += 10;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
