import java.util.Collections;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> seenCharacters = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (seenCharacters.contains(s.charAt(j))) {
                    break;
                } else {
                    seenCharacters.add(s.charAt(j));
                }
            }
            int currentLength = seenCharacters.size();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
