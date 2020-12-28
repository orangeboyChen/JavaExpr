package com.nowcent.Expr2;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 15:59
 */
public abstract class SubstanceDecorator extends Pizza{
    Pizza pizza;

    public SubstanceDecorator(Pizza pizza, String decorateDescription){
        this.pizza = pizza;
        pizza.description += " and " + decorateDescription + " pizza.";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public int getCost() {
        return pizza.cost;
    }
}
