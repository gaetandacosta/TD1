import java.util.*;

/**
 * 
 */
public class etudiant extends Utilisateur {

    private string numEtudiant;
    /**
     * Default constructor
     */
    public etudiant(String numEtudiant, String nom, String prenom, String, adresse, String mail) {
        this.numEtudiant = numEtudiant;
        super(nom, prenom, adresse, mail);
    }



    /**
     * @return
     */
    public bool rendreDevoir() {
        System.out.println("A rendu un devoir");
        return true;
    }


}