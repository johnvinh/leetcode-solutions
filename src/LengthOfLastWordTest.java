import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void example1() {
        assertEquals(lengthOfLastWord.lengthOfLastWord("Hello World"), 5);
    }

    @Test
    public void example2() {
        assertEquals(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "), 4);
    }

    @Test
    public void example3() {
        assertEquals(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"), 6);
    }
}