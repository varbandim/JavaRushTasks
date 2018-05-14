package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> fileTree = new ArrayList<>();
        Stack<File> stack = new Stack<>();
        stack.push(new File(root));
        while (!stack.isEmpty()) {
            File child = stack.pop();
            if (child.isDirectory()) {
                for (File f :
                        child.listFiles()) {
                    stack.push(f);
                }
            } else if (child.isFile()) {
                fileTree.add(child.getAbsolutePath());
            }
        }

        return fileTree;

    }

    public static void main(String[] args) throws IOException {
        List<String> fiTr = new ArrayList<>();
        fiTr = getFileTree("D:"+ File.separator + "222222222" + File.separator);
        for (String s :
                fiTr) {
            System.out.println(s);
        }
        }
    }