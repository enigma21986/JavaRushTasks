package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String url = bufferedReader.readLine();

        String[] urlParts = url.split("\\?");
        String[] queryParts = urlParts[1].split("&");

        boolean isObjExist = false;
        Object objValue = null;
        List<String> paramNames = new ArrayList<>();

        for (String str : queryParts) {
            String[] substrings = str.split("=");
            String paramName = substrings[0];
            paramNames.add(substrings[0]);

            if (paramName.equals("obj")) {
                isObjExist = true;
                try {
                    objValue = Double.valueOf(substrings[1]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    objValue = substrings[1];
                }
            }
        }

        System.out.println(String.join(" ", paramNames));

        if (isObjExist) {
            if (objValue instanceof Double) {
                alert((double) objValue);
            } else {
                alert(String.valueOf(objValue));
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
