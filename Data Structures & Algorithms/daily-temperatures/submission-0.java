class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[t.length];
        int n = t.length;
        for(int i = n-1;i>-1;i--){
            while(!stack.isEmpty()&&t[i]>=t[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        return result;
    }
}