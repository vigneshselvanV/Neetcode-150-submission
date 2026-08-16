class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length-1;
        int max = 0;
        while(left<right){
            int heigth = Math.min(h[left],h[right]);
            int len   = right-left;
            int area = heigth*len;
            max = Math.max(area,max);
            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }   
        }
        return max;
    }
}
