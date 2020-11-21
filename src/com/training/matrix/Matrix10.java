package com.training.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix10 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;

        Random random = new Random();

        int matrix[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = random.nextInt(50);

            //В задании не нужно, только для проверки
        for (int i = 0; i < m; i++)
            System.out.println(Arrays.toString(matrix[i]));

        System.out.println();

        // Обычное человеческое решение
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j += 2)
//                System.out.print(matrix[i][j] + "  ");
//            System.out.println();
//        }

        // Для людей, беспокойных за кривые столбики (меня)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                String element = "" + matrix[i][j];
                System.out.print(element + " ".repeat(4 - element.length()));
            }
            System.out.println();
        }

    }
}
