package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args)
    {
        System.out.println("Program starts");

        try
        {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown");
        } finally {

        }

        System.out.println("Program is still running");
    }

    public static void method1()
    {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}
