class Solution {
    public boolean isValid(String s) {
      char[] stack = new char[s.length()];
      int tos = -1;
      for(char c : s.toCharArray()){
        if(c=='('){
            stack[++tos] = ')';
        }
        else if(c=='['){
            stack[++tos] = ']';
        }
        else if(c=='{'){
            stack[++tos] = '}';
        }
        else if(tos<0||stack[tos--]!=c){
            return false;
        }
      }
      return tos == -1;
    }
}
