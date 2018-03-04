package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> array = new ArrayList<>();
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                array.add(Integer.valueOf(bufferedReader.readLine()));
            }

        } catch (Exception e) {
            for (Integer num: array) {
                System.out.println(num);
            }
        }
    }
}
