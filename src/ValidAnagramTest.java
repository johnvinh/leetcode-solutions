import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();
    @Test
    public void example1() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void example2() {
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}