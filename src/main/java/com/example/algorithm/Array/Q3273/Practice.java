package com.example.algorithm.Array.Q3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        String[] input = br.readLine().split(" ");
        int sum = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(input[i]));
        }
        Collections.sort(list);

        int start = 0;
        int end = n - 1;
        int count = 0;
        while (start != end){
            int startNum = list.get(start);
            int endNum = list.get(end);

            if (startNum + endNum == sum) {
                count++;
            }
            if (startNum + endNum > sum) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(count);
    }
}
