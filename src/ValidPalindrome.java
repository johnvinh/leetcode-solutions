import java.util.Stack;
import java.util.regex.Pattern;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters
        s = s.replaceAll("[^A-Za-z0-9]+?", "").toLowerCase();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder test = new StringBuilder("");
        while (!stack.empty()) {
            test.append(stack.pop());
        }
        return s.equals(test.toString());
    }
}
