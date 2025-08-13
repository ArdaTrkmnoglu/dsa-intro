package dsa_intro.DSA_files;
import java.util.Hashtable;

public class hashtables {
    
    public static void main(String[] args) {
        
        Hashtable<String, String> hashtable = new Hashtable<>(10);

        hashtable.put("56", "Arda");
        hashtable.put("98", "Ayda");
        hashtable.put("31", "Metehan");
        hashtable.put("41", "Azra");
        hashtable.put("51", "Fatih");

        System.out.println(hashtable);

        for (String key: hashtable.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + hashtable.get(key));
        }
    }
}
