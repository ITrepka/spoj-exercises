package com.spoj.pl.PP0501A;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(NWD(a, b));
        }
    }

    public static int NWD(int a, int b) {
        while (a != b)
            if (a > b)
                a -= b;
            else
                b -= a;
        return a; // lub b - obie zmienne przechowują wynik NWD(a,b)
    }
}
