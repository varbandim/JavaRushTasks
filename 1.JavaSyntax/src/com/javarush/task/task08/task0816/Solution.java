package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;


/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Petrovkin", new Date("JULY 15 1980")); // ОШИБКА ТУТ! JULY!!!
        map.put("Ivanovich", new Date("JANUARY 1 1980"));
        map.put("Ivanov", new Date("FEBRUARY 1 1980"));
        map.put("Vaseskin", new Date("MARCH 1 1980"));
        map.put("Petrenko", new Date("DECEMBER 1 1980"));
        map.put("Fefelov", new Date("OCTOBER 1 1980"));
        map.put("Makarov", new Date("NOVEMBER 1 1980"));
        map.put("Dodikov", new Date("AUGUST 1 1980"));
        map.put("Slavin", new Date("SEPTEMBER 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Date a = (Date) it.next();
            int b = a.getMonth();
            if (b >= 5 && b <= 7) it.remove();
        }
    }

    public static void main(String[] args) {

    }
}
