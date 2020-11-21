package com.training.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix9 {
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
        for (int i = 1; i < m; i+=2)
            System.out.println(Arrays.toString(matrix[i]));

    }
}
