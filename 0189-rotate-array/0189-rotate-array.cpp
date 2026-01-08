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
/*
class Solution {
public :
    void rotate(vector<int>& nums, int k){
        int  nums[] = { 1 , 2, 3, 4, 5} , k = 2
        int n = nums.size();
        k = k % n;
        reverse(nums.begin(), nums.end());
        { 5 , 4, 3, 2, 1}
        reverse(nums.begin(), nums.begin()+k);
        { 4, 5 , 3, 2 , 1}
        revrse(nums.begin() + k,  nums.end());
        {4 , 5, 1, 2 , 3}
    }
}

*/