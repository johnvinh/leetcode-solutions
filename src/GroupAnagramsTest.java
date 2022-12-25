import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void example1() {
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = Arrays.asList(
                List.of("bat"),
                Arrays.asList("nat","tan"),
                Arrays.asList("ate","eat","tea")
        );
        assertEquals(expected, groupAnagrams.groupAnagrams(input));
    }
}