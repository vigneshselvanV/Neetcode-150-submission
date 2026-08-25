class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")||s.equals("*")||s.equals("-")||s.equals("/")){
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int result = 0;
                if(s.equals("+")){
                    result = num1 + num2;
                }
                else if(s.equals("-")){
                    result = num1 - num2;
                }
                else if(s.equals("*")){
                    result = num1 * num2;
                }
                else if(s.equals("/")){
                    result = num1 / num2;
                }
                stack.push(Integer.toString(result));
            }
            else{
                stack.push(s);
            }

        }
        return Integer.parseInt(stack.peek());
    }
}