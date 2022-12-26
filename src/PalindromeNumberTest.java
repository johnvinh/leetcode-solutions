import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    @Test
    public void example1() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }
}