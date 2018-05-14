package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> array = new ArrayList<>();
        int[] int1 = new int[5];
        for (int i = 0; i < int1.length; i++) {
            int1[i] = i;
        }
        array.add(int1);
        int[] int2 = new int[2];
        for (int i = 0; i < int2.length; i++) {
            int2[i] = i;
        }
        array.add(int2);
        int[] int3 = new int[4];
        for (int i = 0; i < int3.length; i++) {
            int3[i] = i;
        }
        array.add(int3);
        int[] int4 = new int[7];
        for (int i = 0; i < int4.length; i++) {
            int4[i] = i;
        }
        array.add(int4);
        int[] int5 = new int[0];
        for (int i = 0; i < int5.length; i++) {
            int5[i] = i;
        }
        array.add(int5);

        return array;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
