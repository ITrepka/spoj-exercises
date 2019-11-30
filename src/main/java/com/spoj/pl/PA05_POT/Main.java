package com.spoj.pl.PA05_POT;

import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        for (int i = 0; i < d; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int lastDigit = lastDigitOfPower(a, b);
            System.out.println(lastDigit);
        }
    }

    public static int lastDigitOfPower(int a, int b) {
        if (b == 0) return 1;
        if (a % 10 == 0) return 0;

        for (int j = 1; j <= 9; j++) {
            if ((a == j || a % 10 == j) && b % 4 == 0) {
                return (int) (Math.pow(j, 4) % 10);
            } else if ((a == j || a % 10 == j) && b % 4 == 1) {
                return (int) (Math.pow(j, 1) % 10);
            } else if ((a == j || a % 10 == j) && b % 4 == 2) {
                return (int) (Math.pow(j, 2) % 10);
            } else if ((a == j || a % 10 == j) && b % 4 == 3) {
                return (int) (Math.pow(j, 3) % 10);
            }
        }
        throw new RuntimeException("Something wrong happened");
    }
}