package com.spoj.pl.FCTRL3;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

//Dwie cyfry silni
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt(); //testy
        int number;
        for (int i = 0; i < d; i++) {
            number = scan.nextInt();
            String tensAndUnities = findTensAndUnities(number);
            System.out.println(tensAndUnities);
        }
    }

    public static String findTensAndUnities(int number) {
        int silnia = 1;
        int tens = 0;
        int unities = 0;
        if (number >= 10) {
            return tens + " " + unities;
        } else {
            for (int j = 1; j <= number; j++) {
                silnia *= j;
            }
            tens = (silnia / 10) % 10;
            unities = (silnia % 10);
            return tens + " " + unities;
        }
    }
}