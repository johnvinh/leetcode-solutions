import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    RansomNote ransomNote = new RansomNote();

    @Test
    public void example1() {
        assertFalse(ransomNote.canConstruct("a", "b"));
    }

    @Test
    public void example2() {
        assertFalse(ransomNote.canConstruct("aa", "ab"));
    }

    @Test
    public void example3() {
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }
}