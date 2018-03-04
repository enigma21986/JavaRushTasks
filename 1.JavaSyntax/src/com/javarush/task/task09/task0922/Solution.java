package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        Date date = new Date(input);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");


        String output = simpleDateFormat.format(date).toUpperCase();

        System.out.println(output);
    }
}
