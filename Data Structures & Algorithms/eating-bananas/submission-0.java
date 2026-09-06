class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int i : piles){
            high = Math.max(high,i);
        }
        int ans  = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(can(h,mid,piles)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }
    private boolean can(int h,int k,int[] piles){
        long hours =0;
        for(int i : piles){
           hours+=(i+k-1)/k;
        }
        return hours<=h;
    }
}