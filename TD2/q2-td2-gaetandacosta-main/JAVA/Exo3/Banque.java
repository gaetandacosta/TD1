package Exo3;

public class Banque {


    public Carte commande(String type, String fournisseur){
        Carte c ;
        if (fournisseur.equals("MasterCard")){
            if(type.equals("Débit")){
                c = new CarteFactoryCD().fabriquerMasterCard();
            }
            else {
                c = new CarteFactoryCC().fabriquerMasterCard();
            }
        }
        else if (fournisseur.equals("Visa")){
            if(type.equals("Débit")){
                c = new CarteFactoryCD().fabriquerVisa();
            }
            else {
                c = new CarteFactoryCC().fabriquerVisa();
            }
        }
        else{
            return null;
        }

        return c;
    }
}
