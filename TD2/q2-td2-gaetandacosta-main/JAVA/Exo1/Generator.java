package Exo1;

public class Generator {
    // static variable single_instance of type Singleton
    private static Generator single_instance = null;
    private static int ID;
    // private constructor restricted to this class itself
    private Generator() {
        this.ID=0;
    }

    // static method to create instance of Singleton class
    public static Generator generator() {

        if (single_instance == null) {
            System.out.println("Existe pas");
            single_instance = new Generator();
        }
        else {
            System.out.println("Existe déjà");
            ID++;
            System.out.println("Ancien ID: " + --ID + ", Nouvel ID: "+ ++ID);
        }

        return single_instance;
    }
    public static String getId(){
        return "ID_"+ ID;
    }
}