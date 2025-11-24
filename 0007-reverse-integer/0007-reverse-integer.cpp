class Solution {
public:
    int reverse(int x) {
        long long rev = 0; // use long long to detect overflow

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;

            if (rev > INT_MAX || rev < INT_MIN)
                return 0;

            x = x /= 10;
        }
        return (int)rev;
    }
};

/*
a test case lets say 
x = 132
132 != 0 correct loop runs
it digit = 132 % 10 == modulo gives last digit that is 2 
then int digit = 2
now rev = rev * 10 + digit;
rev = 0
rev = 0 * 10 + 2
rev = 0 + 2 = 2
rev = 2
her rev > INT_MAX || rev < INT_MIN 
the condiiton says
INT_MAX =  2147483647   (2^31 - 1)
INT_MIN = -2147483648   (-2^31)
If reversing x causes the value to go outside the
signed 32-bit integer range [-231, 231 - 1],
then return 0.
this is -231 <= x <= 231 - 1 constrains.
pretty good algorithm haa
*/