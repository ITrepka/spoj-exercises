package com.spoj.pl.PP0506A;

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            List<Point> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String name = scan.next();
                int x = scan.nextInt();
                int y = scan.nextInt();
                Point sort = new Point(name, x, y);
                list.add(sort);
            }
            Collections.sort(list);
            for (Point item : list) {
                System.out.printf("%s %d %d\n", item.getName(), item.getX(), item.getY());
            }
            System.out.println();
        }
    }
}

class Point implements Comparable<Point> {
    private String name;
    private int X;
    private int Y;
    private double distance;

    public Point(String nazwa, int x, int y) {
        this.name = nazwa;
        X = x;
        Y = y;
        distance = Math.sqrt(x * x + y * y);
    }

    public int getY() {
        return Y;
    }

    public int getX() {
        return X;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Point other) {
        return Double.compare(this.distance, other.distance);
    }
}
