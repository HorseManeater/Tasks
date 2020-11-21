package com.training.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {

        String filename = "some.txt";
        int n = 15;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 1; i <= n; i++) {
                writer.write(i*2 + " ");
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
