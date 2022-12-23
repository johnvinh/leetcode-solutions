import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumFastTest {
    TwoSumFast twoSum = new TwoSumFast();

    @Test
    public void example1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{1, 0}, twoSum.twoSum(nums, target));
    }

    @Test
    public void example2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        assertArrayEquals(new int[]{2, 1}, twoSum.twoSum(nums, target));
    }

    @Test
    public void example3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        assertArrayEquals(new int[]{1, 0}, twoSum.twoSum(nums, target));
    }
}