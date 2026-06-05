class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        gp(l,0,0,new char[2*n],n);
        return l;
    }private void gp(List<String> l, int o, int c, char[] arr, int n) {
        if(o>n || c>o)return;
        // System.out.println(new String(arr));
        if(o<n){
            arr[o+c]='(';
            gp(l,o+1,c,arr,n);
        }if(o>c){
            arr[o+c]=')';
            gp(l,o,c+1,arr,n);
        }if(o+c==2*n){
            l.add(new String(arr));
            return;
        }
    }
}