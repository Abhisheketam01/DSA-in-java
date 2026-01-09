class Solution {
public:
    bool check(vector<int>& nums) {
        int n = nums.size();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
                if (count > 1) return false;
            }
        }
        return true;
        // int n = nums.size();
        // int count = 0;

        // for(int i = 0; i < n; i++) {
        //     if(nums[i] > nums[(i+1) % n]) {
        //         count++;
        //     }
        // }

        // // If array decreases more than once, it's not sorted+rotated
        // return count <= 1;
    }
};