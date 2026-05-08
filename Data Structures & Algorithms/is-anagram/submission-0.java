class Solution {
    public boolean isAnagram(String s, String t) {
        int harr[]= new int[26];
        for(char c: s.toCharArray()){
            harr[c-'a']++;
        }
        for(char c: t.toCharArray()){
            harr[c-'a']--;
        }
        return check(harr);
    }
    public static boolean check(int [] harr){
        //int s=0;
        for(int i:harr){
           if(i!=0) return false;
        }
        return true;
    }
}
