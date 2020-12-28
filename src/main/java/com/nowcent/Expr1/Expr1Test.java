package com.nowcent.Expr1;

import com.nowcent.Expr2.ChickenDecorator;
import com.nowcent.Expr2.Pizza;
import com.nowcent.Expr2.VegPizza;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/28 10:07
 */
public class Expr1Test {
    public static void test(){
        System.out.println("====实验1====");
        System.out.println("需要鸡肉蔬菜味的");
        Pizza pizza = new VegPizza();
        pizza = new ChickenDecorator(pizza);
        System.out.println(pizza.getDescription());
    }
}
