// class Solution {
// public:
//     bool canPartition(vector<int>& nums) {
//         int n = nums.size();
//         int total = 0;
//         for (int i = 0; i < n; i++) {
//             total += nums[i];
//         }
//         if (total % 2 != 0) {
//             return false;
//         }
//         int target = total / 2;
//         vector<bool> dp(target + 1, false);
//         dp[0] = true;
//         for (int num : nums) {
//             for (int s = target; s >= num; s--) {
//                 dp[s] = dp[s] || dp[s - num];
//             }
//         }
//         return dp[target];
//     }
// };

































class Solution {
public : 
    bool canPartition(vector<int>& nums){
        int n = nums.size();
        int total = 0;
        for(int i = 0; i < n; i++){
            total = total + nums[i];
        }
        if(total % 2 != 0){
            return false;
        }
        int target = total / 2;
        // how to create an array using target
        vector<bool> dp(target + 1, false);
        dp[0] = true;
        for(int num : nums){
            for(int s = target ; s>=num ; s--){
                dp[s] = dp[s] || dp[s - num];
            }
        }
        return dp[target];
        /*
        🟢 Core Trick (MOST IMPORTANT IDEA)

                If:
                totalSum = S
                If you can find ONE subset with sum = S/2
                Then:
                the remaining elements automatically sum to S/2
                💥 BOOM — second subset is implicit.
                        num = is value 
                🔵 What dp[x] = true REALLY means

                    Say it out loud:
                    “YES, I can make sum x using some of the numbers.”
                    If dp[x] = false:
                    “Nope, impossible so far.”
                dp[s] = dp[s] || dp[s - num]
                7️⃣ Ultra-Simple Mental Formula (Write This)
                    NewSum
                    =
                    OldSum
                    +
                    CurrentNumber
                    NewSum=OldSum+CurrentNumber
                        ​


                    If OldSum was possible → NewSum becomes possible.



        */
    }

};