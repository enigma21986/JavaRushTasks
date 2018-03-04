package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        boolean isExist = true;

        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            isExist = false;
        }

        if (isExist) {
            System.out.println("Треугольник существует.");
        } else System.out.println("Треугольник не существует.");
    }
}