package com.nowcent;

import com.nowcent.Expr1.Expr1Test;
import com.nowcent.Expr2.Expr2Test;
import com.nowcent.Expr2.Pizza;
import com.nowcent.Expr2.SkipWhitespaceOutputStream;
import com.nowcent.Expr3.Expr3Test;
import com.nowcent.Expr3.LinkedList;
import com.nowcent.Expr3.MyLinkedList;
import com.nowcent.Expr4.BTree;
import com.nowcent.Expr4.Expr4Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 10:33
 */
public class Application {
    public static void main(String[] args) {
        Expr1Test.test();
        Expr2Test.test();
        Expr3Test.test();
        Expr4Test.test();
    }
}

