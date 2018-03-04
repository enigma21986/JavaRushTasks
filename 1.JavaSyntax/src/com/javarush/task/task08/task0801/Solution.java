package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {

        HashSet<String> fruts = new HashSet<>();
        fruts.addAll(Arrays.asList("арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"));

        for (String frut : fruts) {
            System.out.println(frut);
        }

    }
}
