package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean flag = true;
        String num = "";
        while (flag) {
            try {
                num = r.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                numbers.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                flag = false;
                for (int i = 0; i < numbers.size(); i++) {
                    System.out.println(numbers.get(i));
                }
            }

        }
    }
}
