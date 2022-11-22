package Exo4;


public class App {
    public static void main(String[] args){



        Etudiant gaetan = new Etudiant.EtudiantBuilder("021", "0717","Dacosta","gaetan")
                .ajouterAnnee_Bac(2020)
                .ajouterTelephone("0614856139").ajouterDomicile("Maison")
                .build();

        Etudiant colin = new Etudiant.EtudiantBuilder("451","15645", "Delrieu", "Colin").build();

        System.out.println(gaetan.toString());
        System.out.println(colin.toString());
    }
}
