package com.training.string;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);

        System.out.println((int) first);
        System.out.println((int) last);
    }
}
