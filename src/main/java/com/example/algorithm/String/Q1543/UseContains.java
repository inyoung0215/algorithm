package com.example.algorithm.String.Q1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseContains {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String str = br.readLine();

        int count = 0;
        while (input.contains(str)) {
            input = input.replaceFirst(str, "-");
            count++;
        }

        System.out.println(count);
    }
}
