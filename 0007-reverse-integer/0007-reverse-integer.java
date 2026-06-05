class Solution {
    public int reverse(int n) {
        int d=0;
        long r=0;
        
        while(n!=0){
            d=n%10;
            r=(r*10)+d;
            n=n/10;
        }
        if (r >= -2147483648 &&  r<=2147483647) {
            return (int) r;
        }
        return 0;
    }
}