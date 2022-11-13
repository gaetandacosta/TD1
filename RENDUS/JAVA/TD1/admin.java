
import java.util.*;

/**
 * 
 */
public class admin extends Utilisateur {

    /**
     * Default constructor
     */
    public admin() {
    }

    /**
     * @return
     */
    public admin adminCreator(String nom, String prenom, String, adresse, String mail) {
        super(nom, prenom, adresse, mail);
        return this;
    }

}