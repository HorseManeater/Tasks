package com.training.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class File4 {
    public static void main(String[] args) {

        List<String> filenames = new ArrayList<>();
        filenames.add("some.txt");
        filenames.add("c.txt");
        filenames.add("a.txt");
        filenames.add("b.txt");

        File catalog = new File(".");
        String[] filesInCatalog = catalog.list();

        if (filesInCatalog == null) {
            System.out.println(0);
            System.exit(0);
        }

        int count = 0;

        for (int i = 0; i < filesInCatalog.length; i++)
            if (filenames.contains(filesInCatalog[i]))
                count ++;

        System.out.println(count);
    }
}
