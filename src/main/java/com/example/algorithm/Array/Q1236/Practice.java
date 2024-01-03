package com.example.algorithm.Array.Q1236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        int countX = 0;
        int[] checkY = new int[y];

        for (int i = 0; i < x; i++) {
            boolean isExist = false;
            String inputX = br.readLine();
            for (int j = 0; j < y; j++) {
                if (inputX.charAt(j) == 'X') {
                    checkY[j] = 1;
                    isExist = true;
                }
            }

            if (!isExist) {
                countX++;
            }
        }

        int countY = 0;
        for (int value : checkY) {
            if (value == 0) {
                countY++;
            }
        }

        int max = Math.max(countX, countY);
        System.out.println(max);
    }
}
