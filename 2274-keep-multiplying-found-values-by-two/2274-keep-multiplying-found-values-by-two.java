Solution in java 

class Solution {
    public int findFinalValue(int[] nums, int original){
        // step 1. defined a data structured.
        Set<Integer> set = new HashSet<>();
        // step 2 . store the elements into it
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        // step 3 we keep on multiply while the set contains the numbers
        while(set.contains(original)){
            original = original * 2;
        }
        return original;
    }
}

solution in c++
    
