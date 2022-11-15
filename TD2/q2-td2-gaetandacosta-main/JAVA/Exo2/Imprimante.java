package Exo2;

import Exo1.Generator;

public class Imprimante {

    // static variable single_instance of type Singleton
    private static Imprimante single_instance = null;
    private static int nbImpression;
    // private constructor restricted to this class itself
    private Imprimante() {
        this.nbImpression=0;
    }

    // static method to create instance of Singleton class
    public static Imprimante imprimer() {

        if (single_instance == null) {
            single_instance = new Imprimante();
        }
        else {
            nbImpression++;
        }

        return single_instance;
    }
    public static String getNbImpression(){
        return "Nombre d'impression : "+ nbImpression;
    }
}
