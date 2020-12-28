package com.nowcent.Expr1;

import java.util.Random;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 10:44
 */
public class Dice {
    private Dice(){}

    public static Dice dice = new Dice();

    public static Dice getInstance(){
        return dice;
    }

    public int throwTheDice(){
        return new Random().nextInt(6) + 1;
    }
}
