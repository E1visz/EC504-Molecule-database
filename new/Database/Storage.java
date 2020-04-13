package Database;

import java.io.*;
import java.util.*;

public class Storage {

    public static void main(String[] args) throws IOException {
        // newDatabase store = new newDatabase();
        // Storage st = new Storage();
        // store.addMolecule("/Users/sulihu/ec504/new2/EC504-Molecule-database/molecule_datbase/water.txt");
        // st.writeCSV(store);
        newDatabase base = new newDatabase();
        Storage store = new Storage();
        base = store.readCSV("/Users/sulihu/ec504/new2/EC504-Molecule-database/molecule_datbase/src/Graphwriter.csv");
        System.out.println(base.data2);
        base.findSubgraph("glucose@24@C@C@C@C@C@C@O@O@O@O@O@O@H@H@H@H@H@H@H@H@H@H@H@H@0 1@1 2@2 3@3 4@4 5@5 6@6 1@0 7@0 12@0 13@7 14@1 15@2 16@2 8@8 17@3 18@3 9@9 19@4 20@4 10@10 21@5 22@5 11@11 23@")

    }

    public void writeCSV(newDatabase NewDatabase) throws IOException {
        try {
            File csv = new File("Graphwriter.csv");

            csv.delete();
            csv.createNewFile();

            BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));

            for (MoleculeGraph value : newDatabase.data2.values()) {
                String tmp = "";
                tmp = value.getSecret();
                bw.write(tmp);
                bw.newLine();
            }
            bw.close();
            } catch (IOException var7) {
            var7.printStackTrace();
        }
    }


    public newDatabase readCSV(String graphFilePath) {
        newDatabase database = new newDatabase();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(graphFilePath));
            String line = null;
            while((line=reader.readLine())!=null){
                MoleculeGraph  G = new MoleculeGraph(line);
                MolecularProperty P = new MolecularProperty(line.split("@")[0],G.hMoleFormula, G.hnumOfAtom, G.hnumOfEdge, G.weightEdge);
                database.data2.put(line.split("@")[0], G);
                database.data.put(P, G);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }



}
