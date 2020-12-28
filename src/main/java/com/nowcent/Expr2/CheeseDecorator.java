package com.nowcent.Expr2;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 16:01
 */
public class CheeseDecorator extends SubstanceDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza, "cheese");
        cost += 20;
    }
}
