package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put("LastName" + i, "FirstName" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String familyName : map.keySet()) {
            if (familyName.equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
