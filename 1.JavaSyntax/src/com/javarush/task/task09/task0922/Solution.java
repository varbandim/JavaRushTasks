package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String datd = r.readLine();
        SimpleDateFormat data = new SimpleDateFormat("MM/dd/yyyy");
        Date day = data.parse(datd);

        SimpleDateFormat resumeData = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(resumeData.format(day).toUpperCase());
    }
}
