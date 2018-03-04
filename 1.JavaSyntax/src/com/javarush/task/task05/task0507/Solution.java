package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList();
        float sum = 0;
        while (true) {
               int digit = Integer.parseInt(bufferedReader.readLine());
               if (digit != -1) {
                   array.add(digit);
               } else {
                   break;
               }
        }
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        System.out.println(sum/array.size());
    }
}

