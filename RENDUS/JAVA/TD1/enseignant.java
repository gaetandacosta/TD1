
import java.util.*;

/**
 * 
 */
public class enseignant extends Utilisateur {

    /**
     * Default constructor
     */
    public enseignant(void string numHarpege, void string numem, String nom, String prenom, String, adresse, String mail) {
        this.numem = numem;
        this.numHarpege = numHarpege;
        super(nom,prenom,adresse, mail);
    }

    /**
     * 
     */
    private String numHarpege;

    /**
     * 
     */
    private String numem;

    /**
     * @return
     */
    public void saisirNote() {
        System.out.println("Saisie des notes");
        return null;
    }

    /**
     * @return
     */
    public void emettreCertificat() {
        System.out.println("Emission de certificat");
        return null;
    }

    /**
     * @return
     */
    public bool affecterEnseignant() {
        System.out.println("affectation des enseignants");
        return true;
    }

    /**
     * @param string numHarpege 
     * @param string numem 
     * @return
     */
    public enseignant enseignantCreator(void string numHarpege, void string numem, String nom, String prenom, String, adresse, String mail) {
        this.numem = numem;
        this.numHarpege = numHarpege;
        super(nom,prenom,adresse, mail);
        return this;
    }

}