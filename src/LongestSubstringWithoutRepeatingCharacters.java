import java.util.Collections;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seenCharacters = new HashSet<>();
        HashSet<Integer> lengths = new HashSet<>();
        int currentLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (seenCharacters.contains(s.charAt(i))) {
                lengths.add(currentLength);
                currentLength = 0;
                seenCharacters.clear();
            }
            seenCharacters.add(s.charAt(i));
            currentLength++;
        }
        return Collections.max(lengths);
    }
}
