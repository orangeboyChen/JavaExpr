package com.nowcent.Expr2;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 15:55
 */
public abstract class Pizza {
    String description = "Unknown Pizza";

    int cost = 0;

    public String getDescription()
    {
        return description;
    }

    public abstract int getCost();

}
