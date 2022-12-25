import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public HashMap<Character, Integer> getLetterCounts(String input) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Integer current = letterCounts.getOrDefault(input.charAt(i), 0);
            letterCounts.put(input.charAt(i), current + 1);
        }
        return letterCounts;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        return out;
    }
}
