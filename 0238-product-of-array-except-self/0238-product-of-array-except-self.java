class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] le = new int[n];
        int[] ri = new int[n];
        le[0] =1;
        ri[n-1]=1;
        for(int i=1;i<n;i++) {
            le[i] = nums[i-1]*le[i-1];
        }
        for(int i=n-2;i>=0;i--) {
            ri[i] = nums[i+1] * ri[i+1];
        }
        for(int i=0;i<n;i++){
            le[i] = le[i]*ri[i];
        }
        return le;
    }
}