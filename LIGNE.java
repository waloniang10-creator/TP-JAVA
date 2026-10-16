# TP-JAVA
blic class Main {
    public static void main(String[] args) {

        String ligne = "2026-09-14;TS-2026-000087;Awa Diop;Médina;WAVE;18500";

        // Découper la ligne avec le point-virgule
        String[] champs = ligne.split(";");

        // Vérifier le nombre de champs
        if (champs.length != 6) {
            System.out.println("Ligne invalide");
        } else {
            String date = champs[0];
            String reference = champs[1];
            String client = champs[2];
            String quartier = champs[3].toUpperCase();
            String paiement = champs[4];
            String montant = champs[5];

            // Afficher le résumé
            System.out.println("Date : " + date);
            System.out.println("Référence : " + reference);
            System.out.println("Client : " + client);
            System.out.println("Quartier : " + quartier);
            System.out.println("Paiement : " + paiement);
            System.out.println("Montant : " + montant + " FCFA");
        }
    }
}
