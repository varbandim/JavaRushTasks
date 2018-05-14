package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Character.isSpaceChar;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Character> vl = new ArrayList<>();
        String input = r.readLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isVowel(c)){
                vow.add(c);
            } else{
                if (isSpaceChar(c)){

                } else vl.add(c);
            }


        }
        for (int i = 0; i < vow.size(); i++) {
            System.out.print(vow.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < vl.size(); i++) {
            System.out.print(vl.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}