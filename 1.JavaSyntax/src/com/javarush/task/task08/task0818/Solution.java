package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Matsklyavichus", 1800);
        map.put("Ivanov", 800);
        map.put("Rabinovich", 3800);
        map.put("Petechkin", 200);
        map.put("Bulkin", 100);
        map.put("Ismeirova", 100);
        map.put("Androschenko", 500);
        map.put("Gavrilov", 1300);
        map.put("Dudkin", 970);
        map.put("Ivakin", 8800);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            if ((int) pair.getValue() < 500) {
                it.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}