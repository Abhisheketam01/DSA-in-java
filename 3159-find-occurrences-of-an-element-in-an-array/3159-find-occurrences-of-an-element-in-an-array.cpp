class Solution {
public:
    vector<int> occurrencesOfElement(vector<int>& nums, vector<int>& queries, int x) {
        int n = nums.size();
        int q = queries.size();
        vector<int> ind;
        for(int i = 0 ; i < n; i++){
            if(nums[i] == x){
                ind.push_back(i);
            }
        }
        vector<int> result(q, -1);
        for(int i = 0; i < q; i++){
            int k = queries[i];
            if(k <= ind.size()){
                result[i] = ind[k-1];
            }
        }
        return result;
        
    }
};