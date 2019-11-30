package com.spoj.pl.PP0504B;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = scan.next();
            String s2 = scan.next();

            String mergedString = mergeString(s1, s2);
            System.out.println(mergedString);
        }
    }

    public static String mergeString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < Math.min(s1.length(), s2.length())) {
            sb.append(s1.charAt(j));
            sb.append(s2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
