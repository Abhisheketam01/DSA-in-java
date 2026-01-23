class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int num1 = INT_MAX;  // smallest so far (i)
        int num2 = INT_MAX;  // second smallest > num1 (j)

        for (int num3 : nums) {  // current element (k)
            if (num3 <= num1) {
                num1 = num3;          // update smallest
            } else if (num3 <= num2) {
                num2 = num3;          // update second smallest
            } else {
                // num3 > num2 > num1
                return true;
            }
        }
        return false;
    }
};
