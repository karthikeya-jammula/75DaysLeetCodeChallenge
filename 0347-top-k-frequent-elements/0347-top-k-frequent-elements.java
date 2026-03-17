class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            } 
        }
        ArrayList<Integer> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys,(a,b)-> hm.get(b)-hm.get(a));
        int r[] = new int[k];
        for(int i=0;i<k;i++)
        {
            r[i]=keys.get(i);
        }
        return r;
    }
}