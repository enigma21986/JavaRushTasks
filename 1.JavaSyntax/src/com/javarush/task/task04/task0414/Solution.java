package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(bufferedReader.readLine());
        int n;

        if (y%4 == 0) {
            if (y%100 == 0) {
                if (y%400 == 0) {
                    n = 366;
                } else n = 365;
            } else {
              n = 366;
            }
        } else {
            n = 365;
        }

        System.out.println("количество дней в году: " + n);
    }
}