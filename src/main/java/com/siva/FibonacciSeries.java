package com.siva;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // First two Fibonacci numbers
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        // Loop to print the next n-2 Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
