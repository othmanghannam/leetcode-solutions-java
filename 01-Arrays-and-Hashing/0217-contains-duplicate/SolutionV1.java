class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set < Integer > tab = new HashSet<>(); 
        for ( int num : nums){
            if (tab.contains(num)){
                return true ; 
            }
            tab.add(num);
        }
        return false ;
    }
}
