class Solution {

public :
    // #include <algorithm>
    void rotate(vector<int>& nums, int k){
        int n = nums.size();
        k = k % n;

        // Step 1: reverse whole array
        reverse(nums.begin(), nums.end());
        // Step 2: reverse first k elements
        reverse(nums.begin(), nums.begin() + k);
        // Step 3: reverse remaining n-k elements
        reverse(nums.begin() + k, nums.end());
    }


};