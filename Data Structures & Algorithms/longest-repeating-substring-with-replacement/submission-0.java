class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int  n = s.length();
        int maxwindowlen = 0;
        int maxfreq = 0;
        int start = 0;
        for(int i = 0;i<n;i++){
            freq[s.charAt(i)-'A']++;
            maxfreq = Math.max(maxfreq,freq[s.charAt(i)-'A']);
            int windowlen = i-start+1;
            if(windowlen-maxfreq>k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            windowlen = i-start+1;
            maxwindowlen = Math.max(windowlen,maxwindowlen);
        }
        return maxwindowlen;

    }
}
