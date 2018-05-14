package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия"+i, "Имя" + i/2);
        }

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            if (me.getValue().equals(name))
                count++;
            }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            if (me.getKey().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
