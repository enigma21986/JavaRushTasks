package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        InputStream inStream = new FileInputStream(fileName);
        Scanner in = new Scanner(inStream);

        List<Integer> array = new ArrayList<>();

        while(in.hasNextLine()){
            Integer num = Integer.valueOf(in.nextLine());
            if (num % 2 == 0) {
                array.add(num);
            }
        }

        Collections.sort(array);

        for (Integer num : array) {
            System.out.println(num);
        }

        in.close();
        bufferedReader.close();
        inStream.close();
    }
}
