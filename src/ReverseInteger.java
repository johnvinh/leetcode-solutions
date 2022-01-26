import java.util.Stack;

public class ReverseInteger {
    public int reverse(int x) {
        String xString = Integer.toString(x);
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < xString.length(); i++)
            stack.push(xString.charAt(i));
        StringBuilder out = new StringBuilder();
        while (!stack.empty())
            out.append(stack.pop());
        return Integer.parseInt(out.toString());
    }
}
