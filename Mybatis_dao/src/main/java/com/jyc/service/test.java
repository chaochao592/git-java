package com.jyc.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        String name = null;
        int ChineseScore = 0;
        int MathScore = 0;
        int EnglishScore = 0;
        ArrayList<Object> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "个学生信息");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            System.out.println("语文成绩");
            ChineseScore = sc.nextInt();
            System.out.println("数学成绩");
            MathScore = sc.nextInt();
            System.out.println("英语成绩");
            EnglishScore = sc.nextInt();
            /*list.add(name);
            list.add(ChineseScore);
            list.add(MathScore);
            list.add(EnglishScore);*/
            List list1 = test2(ChineseScore, MathScore, EnglishScore);
            list1.add(name);
            System.out.println(list1);
        }


        //创建输出流，将集合元素写入到当前目录的list.txt文件中，每个元素为一行
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.text"));
        for (Object file : list) {
            bw.write(String.valueOf(file));
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }

    public static List test2(int a, int b, int c) {
        ArrayList list = new ArrayList();
        if (a > b && a > c & b > c) {
            list.add(a);
            list.add(b);
            list.add(c);
        }
        return list;
    }
}
