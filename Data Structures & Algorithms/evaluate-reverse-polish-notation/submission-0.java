class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") &&!token.equals("/")) {
                stk.push(Integer.parseInt(token));
            }
            else {
                int first = stk.pop();
                int second = stk.pop();
                if (token.equals("+")) {
                    stk.push(second + first);
                }
                else if (token.equals("-")) {
                    stk.push(second - first);
                }
                else if (token.equals("*")) {
                    stk.push(second * first);
                }
                else if (token.equals("/")) {
                    stk.push(second / first);
                }
            }
        }

        return stk.pop();
    }
}