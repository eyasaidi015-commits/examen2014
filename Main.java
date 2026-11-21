package examen2014;

public class Main {
    public static void main(String[] args) {
        ParcAttraction parc = new ParcAttraction("Parc Hammamet", 2);
        Attraction a1 = new Attraction("Grande roue", 5, new ConditionAge(8));
        Attraction a2 = new Attraction("Montagnes russes", 10, new ConditionAge(14));
        Attraction a3 = new Attraction("Train fantôme", 6, new ConditionAge(10));
        parc.ajouteAttraction(a1);
        parc.ajouteAttraction(a2);
        parc.ajouteAttraction(a3); 

        Personne p1 = new Personne("Ali", 12, 150);
        Personne p2 = new Personne("Sara", 20, 170);

        Personne[] visiteurs = {p1, p2};
        Attraction[] jeux = {a1, a2};
        for (Personne p : visiteurs) {
            for (Attraction a : jeux) {
                try {
                    a.utilise(p);
                } catch (AccesInterditException e) {
                    System.out.println("Erreur : " + e.getMessage());
                }
            }
        }
        a1.affiche();
        a2.affiche();
        parc.affiche();
        System.out.println("Recette totale : " + parc.getRecette() + " DT");
    }
}