import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    WordPattern wordPattern = new WordPattern();

    @Test
    public void example1() {
        assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void example2() {
        assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void example3() {
        assertFalse(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
    }
}