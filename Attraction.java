package examen2014;

public class Attraction {
    private String nom;
    private float cout;
    private ConditionAge condition;
    private int nbPersonnes;
    private float recette;

    public Attraction(String nom, float cout, ConditionAge condition) {
        this.nom = nom;
        this.cout = cout;
        this.condition = condition;
        this.nbPersonnes = 0;
        this.recette = 0;
    }

    public String getNom() { return nom; }
    public ConditionAge getCondition() { return condition; }
    public float getRecette() { return recette; }

    public void affiche() {
        System.out.println("Attraction : " + nom + " | Coût : " + cout + " DT" + " | Âge minimal : " + condition.getAgeMin() + " | Nombre de personnes : " + nbPersonnes + " | Recette : " + recette + " DT");
    }

    public void utilise(Personne p) throws AccesInterditException {
        if (!condition.accesPossible(p)) {
            throw new AccesInterditException("Accès interdit à l'attraction " + nom);
        }
        nbPersonnes++;
        recette = recette + cout;
    }
}