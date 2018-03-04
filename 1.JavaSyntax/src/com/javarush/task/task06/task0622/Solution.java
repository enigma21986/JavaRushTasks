package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            array.add(Integer.valueOf(reader.readLine()));
        }

        Collections.sort(array);

        for (Integer element : array) {
            System.out.println(element);
        }

    }

}
