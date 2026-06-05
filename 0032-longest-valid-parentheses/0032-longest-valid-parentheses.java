class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_len = 0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len;        
    }
}