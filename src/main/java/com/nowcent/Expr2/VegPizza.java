package com.nowcent.Expr2;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 15:57
 */
public class VegPizza extends Pizza{

    public VegPizza(){
        super.description = "Vegetable";
        cost += 8;

    }

    @Override
    public int getCost() {
        return cost;
    }


}
