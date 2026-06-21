class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productExceptSelfResult = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int everyNumMultiplied = 1;
            for(int j = 0 ; j < nums.length ; j++){
                if(i != j){
                    everyNumMultiplied = everyNumMultiplied*nums[j];
                }
            }
            productExceptSelfResult[i] = everyNumMultiplied;
        }

        return productExceptSelfResult;
    }
}  
