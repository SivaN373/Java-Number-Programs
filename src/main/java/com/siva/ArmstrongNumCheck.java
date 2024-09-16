package com.siva;

import java.util.Scanner;

public class ArmstrongNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num, result = 0, digits = 0;
        while (original != 0) {
            original /= 10;
            digits++;
        }
        original = num;
        while (original != 0) {
            int rem = original % 10;
            result += Math.pow(rem, digits);
            original /= 10;
        }
        return result == num;
    }
}
