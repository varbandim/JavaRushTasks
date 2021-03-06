package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        HashMap<Integer, String> calendar = new HashMap<>();
        calendar.put(1, "January");
        calendar.put(2, "February");
        calendar.put(3, "March");
        calendar.put(4, "April");
        calendar.put(5, "May");
        calendar.put(6, "June");
        calendar.put(7, "July");
        calendar.put(8, "August");
        calendar.put(9, "September");
        calendar.put(10, "October");
        calendar.put(11, "November");
        calendar.put(12, "December");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String month = r.readLine();

        Iterator<Map.Entry<Integer, String>> it = calendar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> ent = it.next();
            if (month.equals(ent.getValue())) {
                System.out.println(month + " is " + ent.getKey() + " month");
            }
        }
    }
}
