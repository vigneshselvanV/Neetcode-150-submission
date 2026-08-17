class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int s1freq[] = new int[26];
        int s2freq[] = new int[26];
        for(int i = 0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
        }
        int start = 0;
        for(int i = 0;i<s2.length();i++){
            s2freq[s2.charAt(i)-'a']++;
            if(i-start+1>s1.length()){
                s2freq[s2.charAt(start)-'a']--;
                start++;
            }
            if(i-start+1==s1.length()){
                boolean ismatch = true;
                for(int j = 0;j<26;j++){
                    if(s1freq[j]!=s2freq[j]){
                        ismatch = false;
                        break;
                    }
                }
                if(ismatch){
                    return true;
                }
            }
        }
        return false;
        

    }
}
