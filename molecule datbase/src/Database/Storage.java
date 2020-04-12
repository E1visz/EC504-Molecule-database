package Database;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Storage {

    public void writeCSV(newDatabase NewDatabase) throws IOException {
        try {
            File var2 = new File("writers.csv");
            var2.delete();
            var2.createNewFile();
            BufferedWriter var3 = new BufferedWriter(new FileWriter(var2, true));
//            Iterator var4 = NewDatabase.data.entrySet().iterator();
            Iterator var8 = NewDatabase.data2.entrySet().iterator();


            while(var8.hasNext()) {
                MoleculeGraph var5 = (MoleculeGraph) var8.next();
                var5.edges

//                String var6 = var5.getKey() + "," + var5.getValue();
//                var6 = var6.replace("[", " ");
//                var6 = var6.replace("]", "");
                var3.write(var6);
                var3.newLine();
            }

            var3.close();
        } catch (IOException var7) {
            var7.printStackTrace();
        }

    }

}
