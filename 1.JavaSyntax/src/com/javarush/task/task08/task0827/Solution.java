package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        String dateFormat = "MMMM dd yyyy";
        SimpleDateFormat format = new SimpleDateFormat(dateFormat, Locale.US);
        Date receivedDate = new Date();
        try {
            receivedDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Date startDate = new Date();
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);
        startDate.setDate(1);
        startDate.setMonth(0);
        startDate.setYear(receivedDate.getYear());

        long msTimeDistance = receivedDate.getTime() - startDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int)(msTimeDistance / msDay);
        if ((dayCount % 2) == 0) {
            return false;
        }else  return true;
    }
}
