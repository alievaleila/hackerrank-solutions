package org.example.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N >= 2 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + i * N);
            }
        }

        bufferedReader.close();
    }
}

