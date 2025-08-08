package arra;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temperatures = new int[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter temperatures for Day " + (i + 1));
            System.out.print("Morning: ");
            temperatures[i][0] = sc.nextInt();
            System.out.print("Evening: ");
            temperatures[i][1] = sc.nextInt();
        }

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + " Temperatures:");
            System.out.println("  Morning: " + temperatures[i][0]);
            System.out.println("  Evening: " + temperatures[i][1]);
        }

        sc.close();
    }
}