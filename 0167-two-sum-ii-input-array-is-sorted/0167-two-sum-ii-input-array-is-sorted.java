class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int n = nums.length;
        int[] a = new int[2];
        int l = 0;
        int r = n-1;
        while(l<r) {
            if(nums[l]+nums[r]==tar){
                a[0] = l+1;
                a[1] = r+1;
                break;
            }
            else if(nums[l]+nums[r]>tar){
                r--;
            }
            else {
                l++;
            }
        }
        return a;
  }
}