package com.spoj.pl.PRIME_T;

import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t;
        t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int uWartosc = scan.nextInt();
            System.out.println(isPrime(uWartosc) ? "TAK" : "NIE");
        }
    }

    public static boolean isPrime(int uWartosc) {
        if (uWartosc == 0 || uWartosc == 1) return false;
        if (uWartosc == 2) return true;
        for (int i = 2; i <= Math.sqrt(uWartosc); ++i) {
            if (uWartosc % i == 0) return false;
        }
        return true;
    }
}
