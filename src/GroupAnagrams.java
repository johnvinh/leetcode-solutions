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
        // Anagrams will have the same number of characters, thus the same letterCount hashmap
        HashMap<HashMap<Character, Integer>, ArrayList<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            HashMap<Character, Integer> letterCounts = getLetterCounts(str);
            anagramGroups.computeIfAbsent(letterCounts, k -> new ArrayList<>());
            anagramGroups.get(letterCounts).add(str);
        }
        List<List<String>> out = new ArrayList<>();
        for (HashMap<Character, Integer> group : anagramGroups.keySet()) {
            ArrayList<String> anagramGroup = anagramGroups.get(group);
            out.add(anagramGroup);
        }
        return out;
    }
}
