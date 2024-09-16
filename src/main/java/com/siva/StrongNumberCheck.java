package com.siva;

import java.util.Scanner;

public class StrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isStrong(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }

    public static boolean isStrong(int num) {
        int original = num, sum = 0;
        while (num != 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        return sum == original;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

