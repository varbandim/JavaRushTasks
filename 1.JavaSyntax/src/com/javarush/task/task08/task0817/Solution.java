package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Sid");
        map.put("Sidouk", "Fid");
        map.put("Sidoukin", "Rid");
        map.put("Sidoukina", "Rida");
        map.put("Sidoukinov", "Ridam");
        map.put("Sidokum", "Lam");
        map.put("Murin", "Ham");
        map.put("Murinov", "Loam");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        for (String unical:new HashSet<>(map.values())) {
            int count=0;
            for (String name:map.values()) if (name.equals(unical)) count++;
            if (count>1) removeItemFromMapByValue(map,unical);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


    }
}
