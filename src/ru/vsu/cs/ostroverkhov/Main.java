package ru.vsu.cs.ostroverkhov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s = readS();
        if (stopMistake(s)) {
            printRhombus(s);
        }
    }

    public static int readS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter S: ");
        return scanner.nextInt();
    }

    public static boolean stopMistake(int s) {
        boolean result = true;
        if (s < 2 || s % 2 != 0) {
            result = false;
            System.out.println("Error! S must be more than or equal to 2 and be even");
        }
        return result;
    }

    public static void printTopHalfOfRhombus(int s) {
        for (int i = 1; i <= s / 2; i++) {
            for (int j = s / 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void printLowerHalfOfRhombus(int s) {
        for (int i = 1; i <= s / 2; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= s / 2 - i; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j <= s / 2 - i; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static void printRhombus(int s) {
        printTopHalfOfRhombus(s);
        printLowerHalfOfRhombus(s);
    }
}
