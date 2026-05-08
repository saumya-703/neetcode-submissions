class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(target-nums[i])) {
                int val= hmap.get(target-nums[i]);
            return new int[]{val,i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
