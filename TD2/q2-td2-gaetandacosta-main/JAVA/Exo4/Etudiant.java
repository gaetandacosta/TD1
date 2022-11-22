package Exo4;

public class Etudiant {
    private String code_nip;
    private String code_ine;
    private final String nom;
    private String nom_usuel;
    private final String prenom;
    private String date_naissance;
    private String lieu_naissance;
    private int annee_bac;
    private String email;
    private String domicile;
    private String telephone;


    public Etudiant(String code_nip, String code_ine, String nom, String nom_usuel, String prenom, String date_naissance, String lieu_naissance, int annee_bac, String email, String domicile, String telephone) {
        this.code_nip = code_nip;
        this.code_ine = code_ine;
        this.nom = nom;
        this.nom_usuel = nom_usuel;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.lieu_naissance = lieu_naissance;
        this.annee_bac = annee_bac;
        this.email = email;
        this.domicile = domicile;
        this.telephone = telephone;
    }

    public static class EtudiantBuilder
        {
            private String code_nip;
            private String code_ine;
            private final String nom;
            private final String prenom;

            private String nom_usuel;

            private String date_naissance;
            private String lieu_naissance;
            private int annee_bac;
            private String email;
            private String domicile;
            private String telephone;

            public EtudiantBuilder(String code_nip, String code_ine, String nom, String prenom){
                this.nom=nom;
                this.prenom=prenom;
                this.code_nip=code_nip;
                this.code_ine=code_ine;
            }

            public EtudiantBuilder ajouterNom_usuel(String nom_usuel ){
                this.nom_usuel = nom_usuel;
                return this;
            }
            public EtudiantBuilder ajouterDate_Naissance(String date_naissance ){
                this.date_naissance = date_naissance;
                return this;
            }
            public EtudiantBuilder ajouterLieu_Naissance(String lieu_naissance ){
                this.lieu_naissance = lieu_naissance;
                return this;
            }
            public EtudiantBuilder ajouterAnnee_Bac(int annee_bac ){
                this.annee_bac = annee_bac;
                return this;
            }
            public EtudiantBuilder ajouterEmail(String email){
                this.email = email;
                return this;
            }
            public EtudiantBuilder ajouterDomicile(String domicile){
                this.domicile = domicile;
                return this;
            }
            public EtudiantBuilder ajouterTelephone(String telephone){
                this.telephone= telephone;
                return this;
            }




            public Etudiant build() {
                Etudiant user =  new Etudiant(code_nip, code_ine, nom, prenom, nom_usuel, date_naissance, lieu_naissance, annee_bac, email, domicile, telephone);
                return user;
            }

        }

    @Override
    public String toString() {
        return "Etudiant{" +
                "code_nip='" + code_nip + '\'' +
                ", code_ine='" + code_ine + '\'' +
                ", nom='" + nom + '\'' +
                ", nom_usuel='" + nom_usuel + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissance='" + date_naissance + '\'' +
                ", lieu_naissance='" + lieu_naissance + '\'' +
                ", annee_bac=" + annee_bac +
                ", email='" + email + '\'' +
                ", domicile='" + domicile + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
