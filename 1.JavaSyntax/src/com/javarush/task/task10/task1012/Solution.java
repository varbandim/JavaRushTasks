package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        Map<Character, Integer> numOfChars = new TreeMap<Character, Integer>();
        for (int i = 0; i < alphabet.size(); i++) {
            numOfChars.put(alphabet.get(i), 0);
        }
        for (Map.Entry entry : numOfChars.entrySet()) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    if (entry.getKey().equals(list.get(i).charAt(j))) {
                        int c = (int) entry.getValue();
                        c++;
                        entry.setValue(c);
                    }
                }
            }
        }
        for (Character entry : alphabet) {
            for (Map.Entry puk : numOfChars.entrySet()){
                if (entry.equals(puk.getKey())) {
                    System.out.println(entry + " " + puk.getValue());
                }
            }
        }
    }

}
