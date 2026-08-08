class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> s = new HashSet<>(); 
       for(int a : nums){
        s.add(a);
       }
       int ml = 0;
       for(int b :s){
        if(!s.contains(b-1)){
            int cl = 1;
            int cn = b;
            while(s.contains(cn+1)){
                cl++;
                cn++;
            }
             ml = Math.max(ml,cl);
        }
       }
       return ml;
    }
}
