class Solution {
public :
    int earliestTime(vector<vector<int>>& tasks){
        int minTime = INT_MAX;
        for(int i = 0; i < tasks.size(); i++){
            int value = 0;
            for(int j = 0; j < tasks[i].size(); j++){
                value = value + tasks[i][j];
            }
            if(value < minTime){
                minTime = value;
            }
        }
        return minTime;
    }
};