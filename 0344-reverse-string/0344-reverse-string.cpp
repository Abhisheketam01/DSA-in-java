// class Solution {
// public:
//     void reverseString(vector<char>& s) {
//         int left = 0;
//         int right = s.size() - 1;

//         while(left < right ) {
//             char temp = s[left];
//             s[left] = s[right];
//             s[right] = temp;

//             left++;
//             right--; 
//         } 
//     }
// };
class Solution {
public:
    void reverseString(vector<char>& s){
        // int left = 0;
        // int right = s.size()-1;
        // while(left < right){
        //     char temp = s[left];
        //     s[left] = s[right];
        //     s[right] = temp;

        //     left++;
        //     right--;
            int n = s.size();
        // Temporary array to store elements 
        // in reversed order
        vector<int> temp(n);
        // Copy elements from original array 
        // to temp in reverse order
        for(int i = 0; i < n; i++)
        temp[i] = s[n - i - 1];
  
        // Copy elements back to original array
        for(int i = 0; i < n; i++)
        s[i] = temp[i];
    }
};