package Exo3;

public class App {
    public static void main(String[] args){
        Banque banque = new Banque();

        Carte carte1 = banque.commande("Débit", "Visa");
        Carte carte2 = banque.commande("Débit", "MasterCard");
        Carte carte3 = banque.commande("Crédit", "Visa");
        Carte carte4 = banque.commande("Crédit", "MasterCard");

        System.out.println(carte1.attribuer());
        System.out.println(carte2.attribuer());
        System.out.println(carte3.attribuer());
        System.out.println(carte4.attribuer());



    }
}
