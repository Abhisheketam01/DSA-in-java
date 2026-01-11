#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isMatch(string s, string p) {
        int n = s.size();
        int m = p.size();
        vector<vector<bool>> dp(n + 1, vector<bool>(m + 1, false));
        dp[n][m] = true;
        for (int i = n; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                bool firstMatch = (i < n && (s[i] == p[j] || p[j] == '.'));
                if (j + 1 < m && p[j + 1] == '*') {
                    dp[i][j] = dp[i][j + 2] || (firstMatch && dp[i + 1][j]);
                }
                else {
                    dp[i][j] = firstMatch && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }
};


/*
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isMatch(string s, string p) {
        int n = s.size();
        int m = p.size();

        // Step 1: create dp table
        // dp[i][j] = can s[i..n-1] match p[j..m-1]?
        vector<vector<bool>> dp(n + 1, vector<bool>(m + 1, false));

        // Step 2: base case
        dp[n][m] = true; // empty string matches empty pattern

        // Step 3: fill table backwards
        for (int i = n; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                // firstMatch = true if s[i] matches p[j]
                bool firstMatch = (i < n && (s[i] == p[j] || p[j] == '.'));

                // Case 1: next char is '*'
                if (j + 1 < m && p[j + 1] == '*') {
                    // Option 1: skip this char+* (dp[i][j+2])
                    // Option 2: use it if firstMatch (dp[i+1][j])
                    dp[i][j] = dp[i][j + 2] || (firstMatch && dp[i + 1][j]);
                }
                else {
                    // Case 2: next char is not '*', must match one char
                    dp[i][j] = firstMatch && dp[i + 1][j + 1];
                }
            }
        }

        // Step 4: return answer from dp[0][0]
        return dp[0][0];
    }
};

*/