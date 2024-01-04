package com.example.algorithm.Array.Q10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        int[] input = new int[num];
        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        int roop = num;
        while (roop-- > 0) {
            for (int i = 0; i < num; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            bw.write(input[i]+"");
            if (i != (num - 1)) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}