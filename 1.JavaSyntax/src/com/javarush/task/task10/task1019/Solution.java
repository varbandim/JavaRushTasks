package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true){
        try {
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            map.put(name, id);
        } catch (Throwable e) {
            break;
        }
        }
        for (Map.Entry ent:
                map.entrySet()){
            System.out.println(ent.getValue() + " " + ent.getKey());
        }

    }
}
