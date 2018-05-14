package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean test = true;
        while (test) {
            try {
                String sourceFileName = reader.readLine(); //название источника
                String destinationFileName = reader.readLine(); // название назначения

                InputStream fileInputStream = getInputStream(sourceFileName);//поток источника
                OutputStream fileOutputStream = getOutputStream(destinationFileName);//поток назначения

                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    fileOutputStream.write(data);
                }

                fileInputStream.close();
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
            }
            test = false;
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

