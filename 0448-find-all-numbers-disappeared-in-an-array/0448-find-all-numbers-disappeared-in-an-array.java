class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> li = new ArrayList<>();
        int cnt[] = new int[100001];
        for(int i:nums) cnt[i]++;
        for(int i=1;i<=n;i++){
            if(cnt[i]==0){
                li.add(i);
            }
        }
        return li;
    }
}