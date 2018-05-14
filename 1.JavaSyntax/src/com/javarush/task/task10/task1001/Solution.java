package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;//a = 0
        //System.out.println(a);
        int b = (byte) a + 46;// b = 46
        //System.out.println(b);
        byte c = (byte) (a * b);// c = 0
        //System.out.println(c);
        double f = (short) 1234.15;//f = 1234.0
        //System.out.println(f);
        long d = (char) (a + f / c + b);//0+1234.0   /    0 + 46 = 1234.0/46 = 26.8260
        System.out.println(d);
    }
}
