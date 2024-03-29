import java.util.HashMap;
import java.util.HashSet;

public class RansomNote {
    public HashMap<Character, Integer> getLetterCounts(String input) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Integer current = letterCounts.getOrDefault(input.charAt(i), 0);
            letterCounts.put(input.charAt(i), current + 1);
        }
        return letterCounts;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomNoteLetterCounts = getLetterCounts(ransomNote);
        HashMap<Character, Integer> magazineLetterCounts = getLetterCounts(magazine);
        for (Character letter : ransomNoteLetterCounts.keySet()) {
            Integer requiredNumber = ransomNoteLetterCounts.get(letter);
            Integer actualNumber = magazineLetterCounts.getOrDefault(letter, 0);
            if (actualNumber < requiredNumber) {
                return false;
            }
        }
        return true;
    }
}
