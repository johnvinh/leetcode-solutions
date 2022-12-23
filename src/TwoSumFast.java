import java.util.HashMap;

public class TwoSumFast {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            int complement = Math.abs(difference - target);
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(difference, i);
        }
        return new int[]{};
    }
}
