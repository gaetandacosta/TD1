import java.util.*;

/**
 *
 */
public abstract class Utilisateur {

    /**
     *
     */
    private string nom;
    /**
     *
     */
    private string prenom;
    /**
     *
     */
    private string adressePostale;
    /**
     *
     */
    private string mail;

    /**
     * Default constructor
     */
    public Utilisateur() {
    }

    /**
     * @return
     */
    public void consulterDocument() {
        System.out.println("Consulte un Document");
        return null;
    }

    /**
     * @param string nom
     * @param string prenom
     * @param string adressePostale
     * @param string mail
     * @return
     */
    public Utilisateur utilisateurCreator(String nom, String prenom, String adressePostale, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.mail = mail;
        return null;
    }

}