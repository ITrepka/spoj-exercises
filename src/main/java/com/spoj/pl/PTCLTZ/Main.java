package com.spoj.pl.PTCLTZ;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int s = scan.nextInt();
            System.out.println(calculate(s, 0));
        }
    }

    public static int calculate(int s, int n) {
        if (s == 1) return n;
        if (s % 2 == 1) {
            s = 3 * s + 1;
        }else {
            s = s/2;
        }
        n++;
        return calculate(s, n);
    }
}
