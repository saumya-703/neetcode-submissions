class Solution {
    public String longestCommonPrefix(String[] strs) {
        // find the smallest length string in strs Array
        int len=Integer.MAX_VALUE;
        String s= "";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<len){
                len=strs[i].length();
                s=strs[i];
            }
        }
        int i=s.length();
        while(i>=0){
          int count=0;
          String temp= s.substring(0,i);
          for(String t:strs){
            if(t.startsWith(temp)) count++;
          }
          if(count==strs.length) return temp;
          i--;
        }
        return "";
    }
}