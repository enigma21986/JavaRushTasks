package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        InputStream inStream = null;
        try {
            inStream = new FileInputStream(Statics.FILE_NAME);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(inStream);

        while(in.hasNextLine()){
            lines.add(in.nextLine());
        }

        in.close();
        try {
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
