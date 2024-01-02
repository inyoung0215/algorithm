package com.example.algorithm.String.Q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a = str.toUpperCase();

        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[a.charAt(i) - 'A']++;
        }

        int max = 0;
        int idx = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                idx = i;
                isDuplicate = false;
            } else if (count[i] == max) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            System.out.println("?");
        } else {
            char ch = (char) (idx + 'A');
            System.out.println(ch);
        }
    }
}
