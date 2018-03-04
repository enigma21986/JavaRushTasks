package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        short b = (short) 45; // 45
        char c = (short) 'c'; // c
        short s = (short) 1005.22; // 1005
        int i = 150000; // 18928
        float f = 4.10f; // 4.0
        double d = 1.256d; // 1.0
        double result = (f * b) + (i / c) - (d * s) + 562.78d; // (4.0 * 45) + ( 18928 / 99) - (1.0 * 1005) + 562.78

        System.out.println("result: " + result);
    }
}