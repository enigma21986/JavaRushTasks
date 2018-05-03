package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0) {
            inputStream.read(buffer);
        }

        //byte[] bufferReversed = new byte[buffer.length];

        for (int i = 0; i < buffer.length; i++) {
            //bufferReversed[i] = buffer[buffer.length - i];
            outputStream.write(buffer[buffer.length - i]);
        }

        //outputStream.write(bufferReversed);

        inputStream.close();
        outputStream.close();
    }
}
