package com.spoj.pl.PRZEDSZK;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        for (int i = 0; i < d; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            int result = helpNursery(a, b);
            System.out.println(result);
        }
    }

    public static int helpNursery(int a, int b) {
        int temp;
        if (b > a) {
            temp = b;
            b = a;
            a = temp;
        }

        int result = a;
        while (result % a != 0 || result % b != 0) {
            result += a;
        }
        return result;
    }
}
