package com.training.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) {

        String filename = "some.txt";
        int a = 10;
        int d = 4;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < 10; i++)
                writer.write(a - d*i + " ");

        } catch (IOException e){
            System.out.println(e);
        }
    }
}
