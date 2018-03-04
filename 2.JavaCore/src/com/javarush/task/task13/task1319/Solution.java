package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        List<String> array = new ArrayList<>();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        String text;
        while (true) {
            text = bufferedReader.readLine();
            array.add(text);
            if (text.equals("exit")) {
                break;
            }
        }

        for (String line: array) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
