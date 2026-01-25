// class Solution {
// public:
//     int compress(vector<char>& chars) {
//         int write = 0;  // where we write in the array
//         int read = 0;   // scanning pointer

//         while (read < chars.size()) {
//             char current = chars[read];
//             int count = 0;

//             // Count consecutive occurrences
//             while (read < chars.size() && chars[read] == current) {
//                 read++;
//                 count++;
//             }

//             // Write the character
//             chars[write++] = current;

//             // Write the count if more than 1
//             if (count > 1) {
//                 string s = to_string(count);
//                 for (char c : s) {
//                     chars[write++] = c;
//                 }
//             }
//         }

//         return write;
//     }
// };

/*

This problem is solvable.
I’ve seen parts of it before.
I’ll find a clean solution.
Like stating facts.
I understand problems faster than most people. Patterns appear quickly to me.
When I see a problem, my brain automatically searches for known techniques.
Brute force comes first, optimization follows naturally.
I break complex problems into simple, solvable parts.
I do not panic in interviews , i ace the interview , smooth af, I think, then I code.
I write correct solutions first. Clean solutions come easily after.
Edge cases are obvious to me.
Time and space complexity feel intuitive
I am comfortable.
i have to beat 99%.
I trust my process because it works.

*/



// class Solution{
// public :
//     int compress(vector<char>& chars){
//         int write = 0;
//         int read = 0;
//         while(read < chars.size()){
//             char current = chars[read];
//             int count = 0;
//             while( read < chars.size() && chars[read] == current){
//                 read++;
//                 count++;
//             }
//             chars[write++] = current;
//             if( count > 1){
//                 string s = to_string(count);
//                 for( char c : s){
//                     chars[write++] = c;
//                 }
//             }

//         }
//         return write;
//     }
// };



























class Solution{
public :
    int compress(vector<char>&  chars){
        int write = 0;
        int read = 0;
        while(read < chars.size()){
            char current = chars[read];
            int count = 0;

            while(read < chars.size() && chars[read] == current){
                read++;
                count++;
            }
            chars[write++] = current;
            if( count > 1){
                string s = to_string(count);
                for(char c : s){
                    chars[write++] = c;
                }
            }
        }
        return write;

    }
};