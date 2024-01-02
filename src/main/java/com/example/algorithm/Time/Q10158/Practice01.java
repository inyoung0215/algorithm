package com.example.algorithm.Time.Q10158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] arrival = br.readLine().split(" ");
        int time = Integer.parseInt(br.readLine());

        int currentW = Integer.parseInt(arrival[0]);
        int currentH = Integer.parseInt(arrival[1]);
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);

        int directionW = 1;
        int directionH = 1;

        for (int i = 0; i < time; i++) {
            currentW += directionW;
            currentH += directionH;

            if (currentW >= w) {
                directionW = -1;
            } else if (currentW <= 0) {
                directionW = 1;
            }

            if (currentH >= h) {
                directionH = -1;
            } else if (currentH <= 0) {
                directionH = 1;
            }
        }

        System.out.println(currentW + " " + currentH);
    }
}
