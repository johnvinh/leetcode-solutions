import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> closing = Map.ofEntries(
                Map.entry('(', ')'),
                Map.entry('{', '}'),
                Map.entry('[', ']')
        );
        for (int i = 0; i < s.length(); i++) {
            if (closing.containsKey(s.charAt(i))) { // Opening bracket
                brackets.add(s.charAt(i));
            } else { // Closing bracket
                if (brackets.isEmpty()) {
                    return false;
                }
                Character openingBracket = brackets.pop();
                if (s.charAt(i) != closing.get(openingBracket)) {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
