class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        // Build the set using normal for loop
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Keep multiplying while the set contains the number
        while (set.contains(original)) {
            original = original * 2;
        }

        return original;
    }
}
