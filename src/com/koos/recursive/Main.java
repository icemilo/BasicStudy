package com.koos.recursive;

import java.util.Scanner;

/**
 * Created by icemilo on 9/10/15.
 */
public class Main {
    public static void main(String[] args) {
        int numOfRings;
        Scanner input = new Scanner(System.in);

        System.out.print("How many rings : ");
        numOfRings = input.nextInt();

        if(numOfRings > 0) {
            TowerOfHanoi hanoi = new TowerOfHanoi(numOfRings);
            hanoi.move();
        } else {
            System.out.println("Wrong number of rings.");
        }

        input.close();
    }
}
