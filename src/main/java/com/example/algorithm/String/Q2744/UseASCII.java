package com.example.algorithm.String.Q2744;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UseASCII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                sb.append((char) ('a' + ch - 'A'));
            } else {
                sb.append((char) ('A' + ch - 'a'));
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
