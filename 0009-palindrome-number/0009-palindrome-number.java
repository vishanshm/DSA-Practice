class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if (x == 0) return true;
        if (x % 10 == 0) return false;
        int reverseNum = 0;

        while(reverseNum < x) {
            int digit = x % 10;
            x = x / 10;
            reverseNum = reverseNum * 10 + digit;
        }

        if (reverseNum > x) {
            reverseNum = reverseNum / 10;
        }

        return reverseNum == x;
    }
}