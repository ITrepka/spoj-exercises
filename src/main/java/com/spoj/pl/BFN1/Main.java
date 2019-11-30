package com.spoj.pl.BFN1;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int number = scan.nextInt();
            String result = peter(number);
            System.out.println(result);
        }
    }

    public static String peter(int number){
        int counter = 0;
        while (!isPalindrom(number)) {
            number += reverseNumber(number);
            counter++;
        }
        return number + " " + counter;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrom(int number) {
        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length() / 2; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(numberAsString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
