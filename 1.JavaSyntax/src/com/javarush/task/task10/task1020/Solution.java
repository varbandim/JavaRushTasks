package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
       // int[] array = {35,33,31,29,25,27,28,16,14,15,8,9,4,3,6,2,8,7,1,0,15,12};

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
        //for (int i = 0; i < array.length; i++) {
          //  System.out.println(array[i]);
        //}
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
