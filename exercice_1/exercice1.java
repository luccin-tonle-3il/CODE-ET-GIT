/**
 * Classe FactureManager donne la facture total en fonction de la reduction de chaque type de produit
 * Fonction calculerFacture :  pour le total de la facture
 * Fonction ReductProduit : pour distinguer les reductions en fonctions des types
 */
public class FactureManager {
	
	//Declaration des variables
	private String typeProduit;
	private int quantite;
	private double prix;

    /**
     * Calcul du total d'une facture
     * @param typeProduit
     * @param quantite
     *@param prixUnitaire
     *@return total
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        // Calcul du total de base
        double total = quantite * prixUnitaire;

        // Appliquer la réduction spécifique au type de produit
        double reduction = ReductProduit(typeProduit);
        total -= total * reductionProduit;

        // Appliquer une réduction supplémentaire sur le total si nécessaire
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les montants supérieurs à 1000
        }

        return total;
    }

    /**
     *  Retourne la réduction en fonction du type de produit
     *  @param typeProduit : spécifie les différents types de produits
     *  @return  le taux de reduction
     */
    private double ReductProduit(String typeProduit) {
        switch (typeProduit) {
            case "Alimentaire":
                return 0.05; // 5% de réduction pour les produits alimentaires
            case "Electronique":
                return 0.10; // 10% de réduction pour les produits électroniques
            case "Luxe":
                return 0.15; // 15% de réduction pour les produits de luxe
            default:
                return 0.0; // Pas de réduction pour les autres produits
        }
    }
}

