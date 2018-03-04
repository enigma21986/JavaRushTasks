package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = new String[]{"Мама", "Мыла", "Раму"};

        System.out.println(array[0] + array[1] + array[2]);
        System.out.println(array[0] + array[2] + array[1]);
        System.out.println(array[1] + array[0] + array[2]);
        System.out.println(array[1] + array[2] + array[0]);
        System.out.println(array[2] + array[1] + array[0]);
        System.out.println(array[2] + array[0] + array[1]);

    }
}
