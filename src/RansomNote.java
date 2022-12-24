import java.util.HashMap;
import java.util.HashSet;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetterCounts = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            Integer current = magazineLetterCounts.getOrDefault(magazine.charAt(i), 0);
            magazineLetterCounts.put(magazine.charAt(i), current + 1);
        }
        return false;
    }
}
