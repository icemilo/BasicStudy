package com.koos.recursive;

import java.util.Scanner;

/**
 * Created by icemilo on 9/9/15.
 */
public class TowerOfHanoi {
    static int rings;

    public TowerOfHanoi(int rings) {
        this.rings = rings;
    }

    public void move() {
        this.move(rings, 'A', 'B', 'C');
    }

    public void move(int ring, char from, char temp, char dest) {
        if (ring > 0) {
            move(ring - 1, from, dest, temp);
            System.out.println(String.format("Ring %d is moved from %c to %c", ring, from, dest));
            move(ring - 1, temp, from, dest);
        } else {
            System.out.println("Number of rings cannot be less than 1");
        }
    }

}
