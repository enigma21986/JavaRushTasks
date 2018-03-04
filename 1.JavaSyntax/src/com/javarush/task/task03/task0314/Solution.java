package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i=1; i<=10; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.print(i*array[j] + " ");
            }
            System.out.println();
        }
    }
}
