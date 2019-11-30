package com.spoj.pl.PP0502B;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int d = scan.nextInt();
            int[] array = new int[d];
            for (int j = 0; j <= array.length - 1; j++) {
                array[j] = scan.nextInt();
            }
            String reverseArray = reverseArray(array);
            System.out.println(reverseArray);
        }
    }

    public static String reverseArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int k = array.length - 1; k > 0; k--) {
            sb.append(array[k] + " ");
        }
        sb.append(array[0]);
        return sb.toString();
    }
}
