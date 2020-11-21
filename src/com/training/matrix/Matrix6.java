package com.training.matrix;

import java.util.Arrays;

public class Matrix6 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int nSet[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 14};
        int q = 9;

        int matrix[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                    matrix[i][j] = (int) (nSet[j] * Math.pow(q, i));

        for (int i = 0; i < m; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
