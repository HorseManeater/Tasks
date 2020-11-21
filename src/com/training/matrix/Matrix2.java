package com.training.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;

        int matrix[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (j + 1) * 5;

        for (int i = 0; i < m; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
