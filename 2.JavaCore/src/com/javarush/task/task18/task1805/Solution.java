package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        InputStream inStream = new FileInputStream(fileName);

        List<Integer> list = new ArrayList<>();

        while (inStream.available() > 0) {
            list.add(inStream.read());
        }

        inStream.close();

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (int item : distinctList.stream().sorted().collect(Collectors.toList())) {
            sb.append(item).append(" ");
        }

        System.out.print(sb);
    }
}
