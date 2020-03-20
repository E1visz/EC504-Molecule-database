package database.m;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Run {

    static HashMap<Object,List<String>> currentDataBase = new HashMap<>();

    public static void main(String[] args) throws IOException {

        Storage worker = new Storage();

        currentDataBase = worker.readCSV("writers.csv");

        System.out.println("Current database:");
        System.out.println(Arrays.toString(currentDataBase.entrySet().toArray()));
        System.out.println("-----");

        System.out.print( "Enter Your Operation (add / query):\n" );
        Scanner q0 = new Scanner(System.in);
        String index = q0.next( );

        if (index.equals("add")) {
            System.out.print( "Enter One Chemical Name (eg: water / oxygen / isomeric ...):\n" );
            String molecule2Add = q0.next();
            currentDataBase = Database.addMolecule(currentDataBase, molecule2Add);
            System.out.println(molecule2Add+" added.");

        }else if (index.equals("query")) {
            System.out.print( "Enter One Chemical Name (eg: water / oxygen / isomeric ...):\n" );
            String molecule2Find = q0.next();
            Database.findMolecule(currentDataBase, molecule2Find);

        }else{
            System.out.println("Try again.");
        }

        worker.writeCSV(currentDataBase);

    }
}