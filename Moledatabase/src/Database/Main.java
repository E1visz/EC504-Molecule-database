package Database;

public class Main {
    public static void main(String[] args) {
        // newDatabase store = new newDatabase();
        // Storage st = new Storage();
        // store.addMolecule("/Users/sulihu/ec504/final/EC504-Molecule-database/new/water.txt");
        // st.writeCSV(store);
        System.out.println("Initializing the Database...");
        newDatabase base = new newDatabase();
        Storage store = new Storage();
        base = store.readCSV("Graphwriter.csv");
        System.out.println("Initialization completed ^ ^\n");
        long startTime=System.currentTimeMillis();
        System.out.println("Running the test case...\n");
        System.out.println("Add Function: \n");
        base.addMolecule("sulfuric_acid.txt");
        base.addMolecule("Mastoparan.txt");
        base.addMolecule("ammonia.txt");
        base.addMolecule("acetylene.txt");

        System.out.println("\nSearch Function: \n");
        base.findMolecule("water.txt");
        base.findMolecule("isomeric.txt");
        base.findMolecule("ammonia.txt");
        base.findMolecule("sulfuric_acid.txt");


        System.out.println("\nSubgraph Search Function: \n");
        base.findSubgraph("moleculesBromochlorodifluoromethane.txt");
        base.findSubgraph("moleculesDehydrophleomycin D1.txt");

        long endTime=System.currentTimeMillis();
        System.out.println("10 operation running time (10,000 molecules)： " + (endTime-startTime) + "ms");
    }

}
