class Solution {
public:
    int n;
    void dfs(vector<vector<int>> &adj, int u, vector<bool>& visited) {
        visited[u] = true;
        
        //Visit neighbours
        for(int v = 0; v < n; v++) {
            if(adj[u][v] == 1 && !visited[v]) {
                dfs(adj, v, visited);
            }
        }
    }
    
    
    int findCircleNum(vector<vector<int>>& isConnected) {
        n = isConnected.size();
        
        vector<bool> visited(n, false);
        int count = 0;
        
        for(int i = 0; i<n; i++) {
            if(!visited[i]) {
                count++;
                dfs(isConnected, i, visited);
            }
        }
        
        return count;
        
    }
};


        /*
        1. Algorithm - 
        we will loop through each node and  check if it is connected to otheras or not 
        2. if it is connected self good its 1 if it not then its zero 
        3. adj matrix are going to  be used , lie 
        good , so whats now ?
        pseudocde -
        size = n = isConected.size();
        vector<int> visited(n, false);
        int province = 0;
        for(int u = 0; u < n; u++){
            if it is not viisted the == false
                province++;
                dfs(city, isconnects, viisted );
            return province;
            function dfs(city, isConnected, visited):
        visited[city] = true

        for neighbor from 0 to n-1:
            if isConnected[city][neighbor] == 1 AND visited[neighbor] == false:
                dfs(neighbor, isConnected, visited)

        4. code?
        5. questions ?
        brutal testcases
        6. if yes why ? yes
        if no then why no ?
        


        

        }

        ?

        */