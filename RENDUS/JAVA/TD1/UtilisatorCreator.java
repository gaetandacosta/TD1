
import java.util.*;

/**
 * 
 */
public class UtilisatorCreator {

    /**
     * Default constructor
     */
    public UtilisatorCreator() {
    }

    /**
     * @param string nom 
     * @param string prenom 
     * @param string AdressePostale 
     * @param string mail 
     * @return
     */
    public Utilisateur construct(void string nom, void string prenom, void string AdressePostale, void string mail) {
        // TODO implement here
        return new Utilisateur(nom, prenom, AdressePostale, mail);
    }

}