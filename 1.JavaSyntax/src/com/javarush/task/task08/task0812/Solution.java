package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.valueOf(bufferedReader.readLine()));
        }

        Map<Integer, Integer> map = new HashMap<>();

        int prev = -999;
        for (Integer num: arrayList) {
            if (map.keySet().contains(num)) {
                if (num == prev) {
                    map.put(num, map.get(num) + 1);
                } else {
                    continue;
                }
            } else {
                map.put(num, 1);
                prev = num;
            }
        }

        int maxSequence = 0;
        for (Integer value: map.values()) {
            if (value > maxSequence) {
                maxSequence = value;
            }
        }

        System.out.println(maxSequence);

    }
}