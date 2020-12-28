package com.nowcent.Expr2;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 16:00
 */
public class ChickenDecorator extends SubstanceDecorator{
    public ChickenDecorator(Pizza pizza) {
        super(pizza, "chicken");
        cost += 30;
    }
}
