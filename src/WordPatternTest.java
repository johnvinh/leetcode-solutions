import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    WordPattern wordPattern = new WordPattern();

    @Test
    public void example1() {
        assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }
}