/**
 * Classe GestionnaireNotes affiche la moyennes et les notes d'un etudiant
 * methode afficherNotesEtMoyenne
 * methode afficherNotes
 * fonction calculerMoyenn
 */
public class GestionnaireNotes {
	
	//Déclaration des variables
	private String nomEtudiant;
	private int [] notes;

    /**
     * Affiche les notes et la moyenne d'un étudiant
     * @param nomEtudiant : represente le nom de l'etudiant
     * @param notes :represente le tableau de notes
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        afficherNotes(notes);

        // Calcul et affichage de la moyenne
        double moyenne = calculerMoyenne(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Affiche toutes les notes de l'étudiant
     * @param notes : le tableau contennant les notes
     */
    private void afficherNotes(int[] notes) {
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule la moyenne des notes
     * @param notes
     * @return la moyenne
     */
    private double calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;  //faire la somme des notes
        }
        return (double) somme / notes.length;
    }
}
