package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("SUM OF TWO INTEGERS\n");
        System.out.print("-------------------\n");
        Scanner scanner = new Scanner(System.in);
        int integer1,integer2;

        System.out.print("Enter the first integer: ");
        integer1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        integer2 = scanner.nextInt();

        int sum = integer1 + integer2;

        System.out.print("The sum is " + sum + "\n");
    }
}
