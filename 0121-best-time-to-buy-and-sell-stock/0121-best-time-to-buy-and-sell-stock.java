class Solution {
    public int maxProfit(int[] a) {
        int mp=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<buy){
                buy=a[i];
            }
            else{
                if(a[i]>buy){
                    mp=Math.max(a[i]-buy,mp);
                }
            }
        }
        return mp;
    }
}