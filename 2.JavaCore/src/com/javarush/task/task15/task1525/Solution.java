package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* 
Файл в статическом блоке
*/

public class Solution<IOException>    {

    public static List<String> lines = new ArrayList<String>();

    {

        String line;
        try {
        FileReader fr = new FileReader(Statics.FILE_NAME);
        BufferedReader reader = new BufferedReader(fr);

        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        fr.close();
        reader.close();
        }
        catch(FileNotFoundException fN) {
        fN.printStackTrace();
        }
        catch(Exception e) {
        
        System.out.println(e);
    }

    

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
