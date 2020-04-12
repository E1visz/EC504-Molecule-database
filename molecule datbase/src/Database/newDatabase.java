package Database;


import javafx.util.Pair;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class newDatabase {
    //Field
    static HashMap<molecularProperty, MoleculeGraph> data;
    static HashMap<String, MoleculeGraph> data2;


    //method


    //add the molecule by the molecule name
    public void addMolecule(String filePath) {
        String moleculeName = "";
        String input = "";

        try {
            File file = new File(filePath);
            InputStreamReader var4 = new InputStreamReader(new FileInputStream(file));
            BufferedReader var5 = new BufferedReader(var4);
            moleculeName = var5.readLine();
            while(var5.readLine() != null) {
                input += var5.readLine();
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }
        MoleculeGraph G = new  MoleculeGraph(filePath);
        molecularProperty P = new molecularProperty();
        data2.put(moleculeName, G);
        data.put(P, G);
    }

    // find the molecule by using the molecule name
    public void findMolecule(String filePath) {
        String moleculeName = "";
        try {
            File file = new File(filePath);
            InputStreamReader var4 = new InputStreamReader(new FileInputStream(file));
            BufferedReader var5 = new BufferedReader(var4);
            moleculeName = var5.readLine();
        } catch (Exception var7) {
            var7.printStackTrace();
        }
        if (data2.containsKey(moleculeName)) {
            System.out.println("-----");
            System.out.println(moleculeName + "IS FOUND");
            System.out.println("-----");
        } else {
            System.out.println("-----");
            System.out.println("NOT FOUND");
            System.out.println("-----");
        }
    }

    public class molecularProperty implements Serializable {
        String name;
        int numOfAtom;
        int numOfEdge;
        HashMap<String, Integer> MoleFormula;

        //constructor
        public molecularProperty() {
            name = "";
            numOfAtom = 0;
            numOfEdge = 0;
            MoleFormula = new HashMap<>();
        }
        public molecularProperty(int atomNum, int EdgeNum, String moleName, HashMap<String, Integer> formula) {
            name = moleName;
            numOfAtom = atomNum;
            numOfEdge = EdgeNum;
            MoleFormula = formula;
        }
    }




}