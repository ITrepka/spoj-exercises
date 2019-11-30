package com.spoj.pl;

public class Stopper {
    public static double measureTimeSeconds(DoingExercise doingExercise) {
        long start = System.currentTimeMillis();
        doingExercise.doIt();
        long end = System.currentTimeMillis();
        return (start - end) / 1000d;
    }
}
