class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(char c : t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        String ans = "";
        int count = t.length();
        int left = 0;
        int minlen = Integer.MAX_VALUE;
        int start = -1;
        HashMap<Character,Integer> smap = new HashMap<>();

        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            smap.put(c,smap.getOrDefault(c,0)+1);
            if(tmap.containsKey(c) && smap.get(c)<=tmap.get(c)){
                count--;
            }
            while(count==0){
                if(right-left+1<minlen){
                    minlen = right-left+1;
                    start = left;
                }
                char leftchar = s.charAt(left);
                smap.put(leftchar,smap.get(leftchar)-1);
                if(tmap.containsKey(leftchar)&&smap.get(leftchar)<tmap.get(leftchar)){
                    count++;
                }
                left++;
            }
        }
        return start == -1 ? "" : s.substring(start, start + minlen);
    }
}
