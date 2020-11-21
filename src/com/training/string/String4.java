package com.training.string;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        int letterACode = 65;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++)
            System.out.println((char) (letterACode + i));
    }
}

