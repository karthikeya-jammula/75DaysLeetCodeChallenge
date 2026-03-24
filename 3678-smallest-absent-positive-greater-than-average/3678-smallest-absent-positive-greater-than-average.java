class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            sum+=i;
            set.add(i);
        }
        int avg = sum/nums.length+1;
        while(set.contains(avg) || avg<=0) {
            avg++;
        }
        return avg;
    }
}