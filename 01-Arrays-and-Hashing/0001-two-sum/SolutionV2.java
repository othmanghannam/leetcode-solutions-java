class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement ; 
        Map < Integer , Integer > map = new HashMap<>(); 
        for ( int i = 0 ; i < nums.length ; i++){
            complement = target - nums[i] ; 
            if (map.containsKey(complement)){
                return new int[]{i,map.get(complement)} ; 
            }
            map.put(nums[i],i);
        }
        return new int[]{} ; 
    }
}