class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hset= new HashSet<>();
        for(int i:nums){
            hset.add(i);
        }
        int i=1;
        while(true){
            if(!hset.contains(i)) break;
            i++;
        }
        return i;
    }
}