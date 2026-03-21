class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
            nums[k]=nums[i];
            k++;
            }
            else
            c++;
        }
        for(int i=0;i<c;i++){
            nums[k]=0;
            k++;
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
}