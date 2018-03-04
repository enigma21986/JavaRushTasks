package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[10];
        List<Integer> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ints.length; i++) {
            //ints[i] = Integer.parseInt(bufferedReader.readLine());
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        Collections.reverse(list);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = list.get(i);
        }

        for (int num : ints) {
            System.out.println(num);
        }

    }
}

