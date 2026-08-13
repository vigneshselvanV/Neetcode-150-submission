class Solution {
    public int lengthOfLongestSubstring(String s) {
     int start = 0;
     int end = 0;
     int max = Math.min(s.length(),1);
     HashSet<Character> seen = new HashSet<>();
     while(end<s.length()){
        char c = s.charAt(end);
        while(seen.contains(c)){
            seen.remove(s.charAt(start));
            start++;
        }
        seen.add(c);
        int curr = end-start+1;
        max = Math.max(curr,max);
        end++;
     }
     return  max;   
    }
}
