package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        array1 = Arrays.copyOfRange(array, 0, 10);
        array2 = Arrays.copyOfRange(array, 10, 20);

        for (int num : array2) {
            System.out.println(num);
        }
    }
}
