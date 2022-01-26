import java.util.Stack;

public class ReverseInteger {
    public static int reverse(int x) {
        String xString = Integer.toString(x);
        Stack<Character> stack = new Stack<Character>();
        StringBuilder out = new StringBuilder();
        if (xString.charAt(0) == '-') {
            out.append('-');
            for (int i = 1; i < xString.length(); i++)
                stack.push(xString.charAt(i));
        }
        else {
            for (int i = 0; i < xString.length(); i++)
                stack.push(xString.charAt(i));
        }
        while (!stack.empty())
            out.append(stack.pop());
        try {
            return Integer.parseInt(out.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int input = 1534236469;
        System.out.println(reverse(input));
    }
}
