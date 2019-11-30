package com.spoj.pl.SKARBFI;

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        for (int i = 0; i < D; i++) {
            int N = scan.nextInt();
            int vertical = 0;
            int horizontal = 0;
            for (int j = 0; j < N; j++) {
                int direction = scan.nextInt();
                int steps = scan.nextInt();

                vertical += SFVert(direction, steps);
                horizontal += SFHori(direction, steps);
            }
            if (vertical > 0) {
                System.out.println(0 + " " + vertical);
            } else if (vertical < 0)
                System.out.println(1 + " " + (vertical * -1));
            if (horizontal > 0) {
                System.out.println(2 + " " + horizontal);
            } else if (horizontal < 0)
                System.out.println(3 + " " + (horizontal * -1));
            if (vertical == 0 && horizontal == 0) {
                System.out.println("studnia");
            }
        }
    }

    public static int SFVert(int direction, int steps) {
        int Direction = 0;
        if (direction == 0)
            Direction += steps;
        else if (direction == 1)
            Direction -= steps;
        else Direction = 0;
        return Direction;
    }

    public static int SFHori(int direction, int steps) {
        int Direction = 0;
        if (direction == 2)
            Direction += steps;
        else if (direction == 3)
            Direction -= steps;
        else Direction = 0;
        return Direction;
    }
}
