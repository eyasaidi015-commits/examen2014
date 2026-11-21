package examen2014;

public class ParcAttraction {
    private Attraction[] lesAttractions;
    private String nom;
    private int nb_attraction;
    public int taille;

    public ParcAttraction(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
        this.lesAttractions = new Attraction[taille];
        this.nb_attraction = 0;
    }

    public void ajouteAttraction(Attraction a) {
        if (nb_attraction < taille) {
            lesAttractions[nb_attraction] = a;
            nb_attraction++;
        } else {
            System.out.println("Erreur : le parc est plein, impossible d'ajouter " + a.getNom());
        }
    }

    public float getRecette() {
        float somme = 0;
        for (int i = 0; i < nb_attraction; i++) {
            somme = somme + lesAttractions[i].getRecette();
        }
        return somme;
    }

    public void affiche() {
        System.out.println("Parc : " + nom);
        for (int i = 0; i < nb_attraction; i++) {
            Attraction a = lesAttractions[i];
            System.out.println("Attraction : " + a.getNom() + " | Âge minimal : " + a.getCondition().getAgeMin() + " | Recette : " + a.getRecette() + " DT");
        }
    }
}
