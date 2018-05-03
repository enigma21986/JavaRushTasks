package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        InputStream inStream = new FileInputStream(fileName);

        List<Integer> list = new ArrayList<>();

        while (inStream.available() > 0) {
            list.add(inStream.read());
        }

        inStream.close();

        System.out.print(list.stream().filter(p -> p.equals(44)).count());

    }
}
