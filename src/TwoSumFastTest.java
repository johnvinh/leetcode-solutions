import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumFastTest {
    TwoSumFast twoSum = new TwoSumFast();

    @Test
    public void example1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(nums, target));
    }
}