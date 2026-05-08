class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap= new HashMap<>();
        for(String s: strs){
            char [] ch= s.toCharArray();
            Arrays.sort(ch);
            String newstr= new String(ch);
            if(!hmap.containsKey(newstr)){
                hmap.put(newstr,new ArrayList<>());
            }
            hmap.get(newstr).add(s);
        }
        List<List<String>> res= new ArrayList<>();
        for(List<String> ll: hmap.values()){
            res.add(ll);
        }
        return res;
    }
}
