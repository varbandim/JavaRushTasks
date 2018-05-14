package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        //напишите тут ваш код
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int count = 1;
//        int max = 1;
//        for (int i = 0; i < 10; i++) {
//            list.add(Integer.parseInt(r.readLine()));
//            if (list.get(i) == list.get(i - 1)) {
//                count++;
//            } else {
//                count = 1;
//            }
//            if (max < count) {
//                max = count;
//            }
//        }


//        for (int i = 0; i < list.size()-1; i++) {
//            Integer n = list.get(i);
//
//        }
//        System.out.println(max);
//    }
//}

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        int g = 1;
        int h = 1;

        for(int i = 0; i < 10; i++){
            list.add(sc.nextInt());
            if(i > 0 && list.get(i) == list.get(i - 1)) g++;
            else g = 1;
            if(h < g) h = g;
        }

        System.out.println(h);
    }
}