package Database;

import java.io.*;
import java.util.*;

public class Storage {

    public static void main(String[] args) throws IOException {
        newDatabase database = new newDatabase();
        database.addMolecule("C:/Users/M S I/Desktop/molecule datbase/isomeric.txt");
        Storage st = new Storage();
        st.writeCSV(database);
//        Storage st = new Storage();
//        newDatabase database = st.readCSV("writers.csv");
//        database.findMolecule("isomeric.txt");
//        System.out.println(database.data2);


    }

    public void writeCSV(newDatabase NewDatabase) throws IOException {
        try {
            File csv = new File("writers.csv");
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

    public newDatabase readCSV(String filepath) {
        newDatabase database = new newDatabase();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = null;
            while((line=reader.readLine())!=null){
                database.data2.put(line.split(",")[0], new MoleculeGraph(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }


}
