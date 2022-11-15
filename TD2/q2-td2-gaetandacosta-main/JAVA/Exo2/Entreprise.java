package Exo2;

public class Entreprise {
    public static void main(String[]args){

        for(int i = 0; i<10; i++) {
            Imprimante.imprimer();
        }
        System.out.println(Imprimante.getNbImpression());
        Imprimante.imprimer();
        System.out.println(Imprimante.getNbImpression());
    }
}
