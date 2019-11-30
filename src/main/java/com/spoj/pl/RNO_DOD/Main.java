package com.spoj.pl.RNO_DOD;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        for (int i = 0; i < d; i++) {
            int n = scan.nextInt();
            int result = 0;
            for (int j = 0; j < n; j++) {
                result += scan.nextInt();
            }
            System.out.println(result);
        }
    }
}