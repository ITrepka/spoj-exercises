package com.spoj.pl.FLAMASTE;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        for (int i = 0; i <= d; i++) {
            String flam = scan.nextLine();
            String flamaster = flamaster(flam);
            System.out.println(flamaster);
        }
    }

    public static String flamaster(String flam) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < flam.length()) {
            int charCounter = 1;
            char currentChar = flam.charAt(j);
            j++;
            for (; j < flam.length() && flam.charAt(j) == currentChar; j++) {
                charCounter++;
            }
            if (charCounter == 1) {
                sb.append(currentChar);
            } else if (charCounter == 2) {
                sb.append(currentChar);
                sb.append(currentChar);
            } else if (charCounter > 2) {
                sb.append(currentChar);
                sb.append(charCounter);
            }
        }
        return sb.toString();
    }
}