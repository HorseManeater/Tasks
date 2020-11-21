package com.training.string;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char c = input.charAt(0);

        System.out.println((int)c);
    }
}
