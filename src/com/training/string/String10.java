package com.training.string;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        char c[] = s.toCharArray();
        String reverted = "";

        for (int i = c.length - 1; i >= 0 ; i--)
            reverted = reverted + c[i];

        System.out.println(reverted);
    }
}
