/**
 * Classe StockManager donne l'etat du stock
 * methode gererStock l'etata du stock après une operation d'ajout ou de retrait du produit
 * methode ajouterStock gerer l'ajout d'un prodiut sur le stock
 * methode retirerStock gerer le retrait d'un produit sur le stock
 */
public class StockManager {

    /**
     * gerer les opérations de stock : ajout ou retrait
     * @param typeOperation : type d'opération : "ajout" ou "retrait"
     * @param produit: nom du produit à gérer
     * @param quantite: quantité à ajouter ou retirer
     * @param stock: stock initial avant l'opération
     * @return : le nouveau stock après l'opération
     */
    public int gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Si l'opération est un ajout
        if (typeOperation.equals("ajout")) {
            stock = ajouterStock(produit, quantite, stock);
        // Si l'opération est un retrait
        } else if (typeOperation.equals("retrait")) {
            stock = retirerStock(produit, quantite, stock);
        // Si l'opération est inconnue
        } else {
            System.out.println("Opération inconnue.");
        }
        return stock; // Retourne le stock mis à jour
    }

    /**
     * Ajoute de la quantité au stock
     * @param produit : nom du produit
     * @param quantite : la quantité à ajouter
     * @param stock: le stock initial
     * @return le nouveau stock
     */
    private int ajouterStock(String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        return stock; // Retourne le nouveau stock
    }

    	/**
    	 * retire de la quantité du stock
    	 * @param produit : nom du produit
    	 * @param quantite : la quantité à retirer
    	 * @param stock: le stock initial
    	 * @return le nouveau stock.
    	 */
    private int retirerStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
        return stock; // Retourne le stock mis à jour
    }
}
