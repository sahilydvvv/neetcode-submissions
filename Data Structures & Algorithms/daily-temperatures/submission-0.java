class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[temperatures.length];
        stk.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int pre = stk.pop();
                arr[pre] = i - pre;
            }
            stk.push(i);
        }
        return arr;
    }
}