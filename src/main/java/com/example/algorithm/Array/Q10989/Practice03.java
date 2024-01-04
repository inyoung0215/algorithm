package com.example.algorithm.Array.Q10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        int[] input = new int[10001];
        for (int i = 0; i < num; i++) {
            int t = Integer.parseInt(br.readLine());
            input[t]++;
        }

        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            while (input[i]-- > 0) {
                bw.write(i + "");
                count++;
                if (count < num) {
                    bw.newLine();
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
