class Solution {
public :
    vector<int> occurrencesOfElement(vector<int>& nums, vector<int>& queries, int x){
        /* step 1 , store the indices of x found in nums */
        vector<int> indices;
        for(int i = 0;i< nums.size(); i++){
            if(nums[i] == x){
                indices.push_back(i);
            }
        }
        /* step 2 . create an array result of size.queries and put -1 */
        int q = queries.size();
        vector<int> result(q, -1);
        for(int i = 0; i < q; i++){
            int k = queries[i];
            if(k <= indices.size()){
                result[i] = indices[k-1];
            }
        }
        return result;
    }
};