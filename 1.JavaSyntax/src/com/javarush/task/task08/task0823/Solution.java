package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        /*Проверяю строку на вхождение пробела U+0020
        * если пробел находится, то возвращаю индекс пробела. Инкрементирую индекс
        * Получаю из индекса букву и charAt
        * полученную букву переводим в верхний регистр*/
        StringBuffer str = new StringBuffer(s);
        String space = " ";
        char sp = space.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(0);
            c = Character.toUpperCase(c);
            str.setCharAt(0, c);
            if (str.charAt(i) == sp) {
                c = str.charAt(i+1);
                c = Character.toUpperCase(c);
                str.setCharAt(i+1, c);
            }
        }

        System.out.println(str);

    }
}
