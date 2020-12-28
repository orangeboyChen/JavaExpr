package com.nowcent.Expr2;

import com.nowcent.Application;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/28 10:08
 */
public class Expr2Test {
    public static void test(){
        System.out.println();
        try {
            test1();
            test2();
            test3();
        }catch (IOException e){
            e.printStackTrace();
        }
    }



    private static void test1() throws IOException {
        System.out.println("====实验2-1====");

        OutputStream outputStream = new SkipWhitespaceOutputStream(System.out);

        System.out.print("输入一段带空格的字符串：");
        Scanner scanner = new Scanner(System.in);

        outputStream.write(scanner.nextLine().getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
//        outputStream.close();
    }

    private static void test2() throws IOException {
        System.out.println("\n====实验2-2====");
        System.out.println("把classpath/file目录下的所有txt文件内容写入D:/j.txt中");
        File fileDirectory = new File(Application.class.getResource("/").getPath() + "/file/");
        OutputStream fileOut = new FileOutputStream("D:/j.txt");

        File[] files = fileDirectory.listFiles();
        assert files != null;
        for (File file : files) {
            if(file.isFile()){
                InputStream inputStream = new FileInputStream(file.getPath());
                byte[] temp1 = new byte[(int) file.length()];
                int temp2 = 0;
                while((temp2 = inputStream.read(temp1)) != -1){
                    fileOut.write(temp1);
                }
                inputStream.close();
            }
        }
        fileOut.flush();
        fileOut.close();

    }

    private static void test3() throws IOException {
        System.out.println("====实验2-3====");
        System.out.println("对D:/j.txt进行写入与读取");
        File file = new File("D:/j.txt");
        RandomAccessFile ras = new RandomAccessFile(file, "rw");
        ras.seek(0);

        ras.writeBytes("12333333\n455666666\n");

        ras.seek(0);
        String secondLine = "";
        ras.readLine();
        secondLine = ras.readLine();

        ras.writeBytes("789\n101112\n131415\n");

        ras.close();
        System.out.println("第二行的内容为 " + secondLine);

    }
}
