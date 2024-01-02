package com.example.algorithm.String.Q1919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strA = br.readLine();
        String strB = br.readLine();
        String answerA = strA;
        String answerB = strB;
        int count = 0;

        for (int i = 0; i < strA.length(); i++) {
            char chA = strA.charAt(i);
            if (answerB.indexOf(chA) != -1) {
                answerB = answerB.replaceFirst(Character.toString(chA), "");
            } else {
                count++;
            }
        }

        for (int i = 0; i < strB.length(); i++) {
            char chA = strB.charAt(i);
            if (answerA.indexOf(chA) != -1) {
                answerA = answerA.replaceFirst(Character.toString(chA), "");
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}
