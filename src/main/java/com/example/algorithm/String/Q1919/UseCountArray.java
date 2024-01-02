package com.example.algorithm.String.Q1919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseCountArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strA = br.readLine();
        String strB = br.readLine();

        int[] countA = count(strA);
        int[] countB = count(strB);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(countA[i] - countB[i]);
        }

        System.out.println(ans);
    }

    public static int[] count(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        return count;
    }
}
