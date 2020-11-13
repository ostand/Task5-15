package ru.vsu.cs.ostroverkhov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s = readS();
        if (s >= 2 && s % 2 == 0) {
            printRhombus(s);
        } else {
            printErrorCheck();
        }
    }

    static void printRhombus(int s) {
        printTopHalfOfRhombus(s);
        printLowerHalfOfRhombus(s);
    }

    static void printLowerHalfOfRhombus(int s) {
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

    static void printTopHalfOfRhombus(int s) {
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

    static void printErrorCheck() {
        System.out.println("Error! S must be more than or equal to 2 and be even");
    }

    static int readS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter S: ");
        return scanner.nextInt();
    }
}
