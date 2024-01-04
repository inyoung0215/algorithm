package com.example.algorithm.Array.Q10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        int[] input = new int[num];
        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        int[] output = new int[num];
        for (int i = 0; i < input.length; i++) {
            boolean isFind = false;
            for (int j = 0; j < i; j++) {
                if (input[i] < output[j]) {
                    for (int k = i - 1; k >= j; k--) {
                        output[k + 1] = output[k];
                    }
                    isFind = true;
                    output[j] = input[i];
                    break;
                }
            }
            if (!isFind) {
                output[i] = input[i];
            }
        }

        for (int i = 0; i < num; i++) {
            bw.write(output[i]+"");
            if (i != (num - 1)) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
