package org.example.easy;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if (N >= 1 && N <= 100) {
            if (N % 2 == 0) {
                if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            } else {
                System.out.println("Weird");
            }
        }
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.close();
    }
}
