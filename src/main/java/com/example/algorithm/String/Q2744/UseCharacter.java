package com.example.algorithm.String.Q2744;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UseCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int length = str.length();
        for(int i = 0; i < length; i++) {
            char word = str.charAt(i);
            if (Character.isUpperCase(word)) {
                char answer = Character.toLowerCase(word);
                sb.append(answer);
            }

            if (Character.isLowerCase(word)) {
                char answer = Character.toUpperCase(word);
                sb.append(answer);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
