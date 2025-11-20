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
    class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        //Syntax: std::set <data_type> set_name;
        unordered_set<int> s;
        // first store every element into set from array good.
        for(int i = 0; i < nums.size(); i++){
            s.insert(nums[i]);
        }
        //
        while(s.find(original) != s.end()){
            original = original * 2;
        }
        return original;        
    }
};
    
