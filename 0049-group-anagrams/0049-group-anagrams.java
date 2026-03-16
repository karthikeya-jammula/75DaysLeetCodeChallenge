class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);
            if(!hm.containsKey(k)){
                // List<String> li = new ArrayList<>();
                hm.put(k,new ArrayList<>());
            }
            hm.get(k).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}