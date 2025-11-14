class Solution {
    public boolean isPalindrome(int x) {
        int revnum = 0; // the reverse number which we are going to check with dup / x at start revnum =0
        int dup = x;
        while(x > 0){
            int LD = x % 10;
            revnum = revnum * 10 + LD;
            x = x / 10;
        }
        if( dup == revnum){
            return true;
        } else {
            return false;
        }  
    }
}
// class Solution {
//     public boolean isPalindrome(int x) {
//         int revnum = 0;
//         int dup = x;
//         while(x > 0) {
//             int ld = x % 10; // this extracts the last digit And stored in in ld
//             revnum = revnum * 10  + ld ;
//             x = x / 10; // this removes the last digit
//         }
//         if( dup == revnum) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }
