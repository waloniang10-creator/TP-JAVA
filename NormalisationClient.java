public class NormalisationClient {
      /** "  aWA   diOP " -> "Awa Diop" */     
      static String normaliserNom(String saisie) {         
        String[] mots = saisie.strip().toLowerCase().split("\\s+");         
        StringBuilder sb = new StringBuilder();         
        for (String mot : mots) {             
            if (!sb.isEmpty()) sb.append(' ');             
            sb.append(Character.toUpperCase(mot.charAt(0))).append(mot.substring(1));         
        }         return sb.toString();     
    }      
    /** "771234567" -> "77 *** ** 67" */     
    static String masquerTelephone(String tel) {         
        String t = tel.replaceAll("\\D", "");        // garde uniquement les chiffres         t = t.substring(t.length() - 9);               // 9 derniers chiffres         
        // 
        return t.substring(0, 2) + " *** ** " + t.substring(7);     
    }      
    /** "Pagne Wax 6 Yards !" -> "pagne-wax-6-yards" */     
    static String slug(String libelle) {         
        return libelle.strip().toLowerCase()                       
        .replaceAll("[^a-z0-9]+", "-")                       
        .replaceAll("(^-|-$)", "");    
     } 
}
public static void main(String[] args) {
     System.out.println(normaliserNom("  aWA   diOP ")); 
     System.out.println(normaliserNom("mouhamadou   moustapha  NDIAYE"));
      System.out.println(masquerTelephone("+221 77 123 45 67")); 
    System.out.println(slug("Pagne Wax 6 Yards !")); 
     System.out.println("TS-%d-%06d".formatted(2026, 123));
 } 
} 
