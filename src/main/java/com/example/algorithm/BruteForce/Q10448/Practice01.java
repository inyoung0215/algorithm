package com.example.algorithm.BruteForce.Q10448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] input = new int[t];
        int[] eureka = new int[45];

        for (int i = 0; i < t; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        int start = 1;
        int p = 2;
        for (int i = 0; i < 45; i++) {
            eureka[i] = start;
            start += p;
            p++;
        }

        for (int num : input) {
            boolean isFind = false;
            for (int i = 0; i < 45; i++) {
                for (int j = 0; j < 45; j++) {
                    for (int k = 0; k < 45; k++) {
                        int sum = eureka[i] + eureka[j] + eureka[k];
                        if (sum > num) {
                            break;
                        }
                        if (sum == num) {
                            isFind = true;
                            break;
                        }
                    }
                    if (eureka[i] + eureka[j] > num) {
                        break;
                    }

                    if (isFind) {
                        break;
                    }
                }
                if (eureka[i] > num) {
                    break;
                }

                if (isFind) {
                    break;
                }
            }

            System.out.println(isFind? 1 : 0);
        }
    }
}
