package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        if (n > 0) {
            n = n * 2;
        } else if (n < 0) {
            n += 1;
        } else n = 0;

        System.out.println(n);

    }

}