package database.m;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Database {

    @SuppressWarnings("unchecked")

    public static List<String> readMolecule (String moculename) {
        List<String> list = new ArrayList();
        try { // file build or open mistake
            /* Read text file of module */
            String pathname = "./molecules/"+moculename+".txt";//用绝对路径
            //String pathname = moculename+".txt";
            File filename = new File(pathname); //
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // build an input stream object reader
            BufferedReader br = new BufferedReader(reader); // transfer the text file to machine language
            String line = "";
            line = br.readLine();
            list.add(line);
            while (line != null) {
                line = br.readLine(); // read the file line by line
                list.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @SuppressWarnings("unchecked")

    // static HashMap<Object,List> map = new HashMap<>();

    public static HashMap<Object, List<String>> addMolecule(HashMap<Object, List<String>> map, String Moleculename) {
        List<String> list = readMolecule(Moleculename);
        map.put(list.get(0), list.subList(1, list.size()-1));
        return map;
    }

    @SuppressWarnings("unchecked")

    public static void findMolecule(HashMap<Object, List<String>> map, String Moleculename) {
        if(map.get(Moleculename) == null) {
            System.out.println("-----");
            System.out.println("There is no this Molecule");
            System.out.println("-----");
        }
        else {
            System.out.println("-----");
            System.out.println(Moleculename);
            List<String> sublist = (List<String>) map.get(Moleculename);
            for(int i = 0; i < sublist.size() ; i++)
                System.out.println(sublist.get(i));
            System.out.println("-----");
        }
    }

}
