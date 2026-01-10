#include <algorithm>
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        vector<int> x(n+m);
        for(int i = 0 ; i < n; i++){
            x[i] = nums1[i];
        }
        for(int i = 0; i < m; i++){
            x[n+i] = nums2[i];
        }
        sort(x.begin(), x.end());
        int z = x.size();
        double mid;

        if(z % 2 == 0){
            mid = (x[z/2-1] + x[z/2]) / 2.00;
        } else {
            mid = x[z/2];
            
        }
        return mid;
    }
};