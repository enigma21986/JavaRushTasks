package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        InputStream inStream = new FileInputStream(fileName);
        Scanner in = new Scanner(inStream);

        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }

        in.close();
        bufferedReader.close();
        inStream.close();
    }
}