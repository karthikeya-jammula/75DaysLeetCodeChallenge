class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<String> li = new ArrayList<>();
        li.add(strs[0]);
        ans.add(li);
        int n = strs.length;
        for(int i=1;i<n;i++) {
            boolean f = false;
            for(List<String> a : ans) {
                if(check(a.get(0),strs[i])){
                    a.add(strs[i]);
                    f=true;
                    break;
                }
            }
            if(!f){
                    List<String> cur = new ArrayList<>();
                    cur.add(strs[i]);
                    ans.add(cur);
            }
        }
        return ans;
    }
    public static boolean check(String n,String m) {
        if(n.length()!=m.length()) return false;
        char[] a = n.toCharArray();
        char[] b = m.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int x = a.length;
        for(int i=0;i<x;i++) {
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}