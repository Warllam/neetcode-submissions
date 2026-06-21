class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicates = false;
        Set setDuplicates = new HashSet<>();

        for(int i = 0; i < nums.length ; i++){
            if(!setDuplicates.add(nums[i])){
                duplicates = true;
            }
        }

        return duplicates;
    }
}