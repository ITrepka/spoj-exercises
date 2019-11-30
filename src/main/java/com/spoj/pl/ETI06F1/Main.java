package com.spoj.pl.ETI06F1;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble(); //promień sfery
        double d = scan.nextDouble(); //odległość między środkami
        double circleField = calculateCircleField(r, d);
        System.out.printf("%.2f", circleField);
    }

    public static double calculateCircleField(double r, double d) {
        double pi = 3.141592654;
        double d2 = d / 2;
        double b = ((r * r) - (d2 * d2));
        double r2 = Math.sqrt(b); // wyliczamy promien z pitagorasa
        return pi * r2 * r2;
    }
}