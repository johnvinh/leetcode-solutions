import java.util.Arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length - 1;
        while (lower != upper) {
            int searchIndice = (lower + upper) / 2;
            int current = nums[searchIndice];
            if (current == target) {
                return searchIndice;
            } else if (nums[lower] == target) {
                return lower;
            } else if (nums[upper] == target) {
                return upper;
            } else if (current < target) {
                lower = searchIndice;
            } else {
                upper = searchIndice;
            }
            System.out.println("Indice: " + searchIndice + ", Lower: " + lower + ", Upper: " + upper);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(SearchInsertPosition.searchInsert(
                new int[]{1,3,5,6},
                6
        ));
    }
}
