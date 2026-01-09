class Solution {
public:
    int hammingWeight(int n) {
        int count = 0;          // Step 2: Initialize count

        while (n > 0) {         // Step 3: Loop while n has bits
            if (n % 2 == 1) {   // Step 4: Check last bit
                count++;        // Increase count if last bit is 1
            }
            n = n / 2;           // Step 5: Remove last bit
        }

        return count;           // Step 6: Return total count
    }
};
