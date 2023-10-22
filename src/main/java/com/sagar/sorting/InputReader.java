package com.sagar.sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputReader {


    public static void main(String[] args) throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("src/com/sagar/sorting/Testcase.txt"));
        List<String> lines = new ArrayList<String>();


        String line= abc.readLine();
        while(line!=null) {
            lines.add(line);
            line = abc.readLine();
            //System.out.println(data);
        }
       abc.close();

        // storing the data in arraylist to array
        String[] array
                = lines.toArray(new String[0]);


        for (String str : array) {
            System.out.println(str);
        }
    }
}
