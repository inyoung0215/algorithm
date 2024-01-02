package com.example.algorithm.String.Q13223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String timeA = br.readLine();
        String timeB = br.readLine();

        if (timeA.equals(timeB)) {
            System.out.println("24:00:00");
            return;
        }

        int[] arrA = timeArr(timeA);
        int[] arrB = timeArr(timeB);
        int[] answer = new int[3];

        for (int i = 2; i > -1; i--) {
            if (arrA[i] > arrB[i]) {
                if (i == 0) {
                    arrB[i] += 24;
                } else {
                    arrB[i - 1]--;
                    arrB[i] += 60;
                }
            }

            answer[i] = arrB[i] - arrA[i];
        }

        for (int i = 0; i < 3; i++) {
            if (answer[i] < 10) {
                sb.append("0");
            }
            if (i != 2) {
                sb.append(answer[i]);
                sb.append(":");
            } else {
                sb.append(answer[i]);
            }
        }

        System.out.println(sb);
    }

    public static int[] timeArr(String str) {
        String[] arr = str.split(":");
        int[] timeArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            timeArr[i] = Integer.parseInt(arr[i]);
        }
        return timeArr;
    }
}
