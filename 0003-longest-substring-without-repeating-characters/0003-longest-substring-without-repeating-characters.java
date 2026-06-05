class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxlen = 0, n = s.length();
        if(n <= 1)return n;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        while(r < n){
            char a = s.charAt(r);
            if(hash[a] < l){
                hash[a] = r;
                maxlen = Math.max(r - l + 1, maxlen);
            }
            else{
                l = hash[a] + 1;
                hash[a] = r;
            }r++;
        }return maxlen;
    }
}