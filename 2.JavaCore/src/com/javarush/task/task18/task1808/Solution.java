package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);

        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);

        int halfOrLess = inputStream.available() / 2;

        byte[] buffer1 = new byte[inputStream.available() - halfOrLess];
        byte[] buffer2 = new byte[halfOrLess];

        if (inputStream.available() > 0) {

            int count1 = inputStream.read(buffer1);
            outputStream1.write(buffer1, 0, count1);

            int count2 = inputStream.read(buffer2);
            outputStream2.write(buffer2, 0, count2);
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();

    }
}
