class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n : map.keySet()){
            int freq = map.get(n);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }
        int res[] = new int[k];
        int count = 0;
        for(int i = bucket.length-1;i>=0&&count<k;i--){
            if(bucket[i]!=null){
                for(Integer inte : bucket[i]){
                    res[count++] = inte;    
                }
            }
        }
        return res;

    }
}
