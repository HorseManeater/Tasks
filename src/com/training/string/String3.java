package com.training.string;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char c = input.charAt(0);
        int code = (int) c;
        char prev = (char) (code - 1);
        char next = (char) (code + 1);

        System.out.println(prev);
        System.out.println(next);
    }
}
