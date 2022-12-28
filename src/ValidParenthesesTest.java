import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();
    @Test
    public void example1() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void example2() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void example3() {
        assertFalse(validParentheses.isValid("(]"));
    }
}