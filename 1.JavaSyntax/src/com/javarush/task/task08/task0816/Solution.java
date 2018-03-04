package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        for (int i = 0; i < 9; i++) {
            map.put("LastName" + i, new Date(1980, i, i+1));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();

        while (it.hasNext()) {

            int currentMonth = it.next().getValue().getMonth() + 1;

            if (currentMonth > 5 && currentMonth < 9) {
                it.remove();
            }

        }

    }

    public static void main(String[] args) {

    }
}
