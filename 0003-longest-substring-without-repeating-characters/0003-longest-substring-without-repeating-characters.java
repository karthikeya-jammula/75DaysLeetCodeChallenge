class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int ans = 0;
       HashSet<Character> set = new HashSet<>();
       int left  =0;
       for(int i=0;i<n;i++) {
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            ans = Math.max(ans,i-left+1);
        }
        else {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
        }
       }
       return ans;
    }
}