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
#include <algorithm> // for reverse
#include <vector>
using namespace std;

class Solution {
public:
    void rotateLeft(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n; // handle cases where k > n

        // Step 1: reverse first k elements
        reverse(nums.begin(), nums.begin() + k);
        // Step 2: reverse remaining n-k elements
        reverse(nums.begin() + k, nums.end());
        // Step 3: reverse whole array
        reverse(nums.begin(), nums.end());
    }
};
*/