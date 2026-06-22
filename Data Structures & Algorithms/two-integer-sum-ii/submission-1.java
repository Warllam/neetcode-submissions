class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        Integer currentAttempt = numbers[i]+numbers[j];
        while(currentAttempt != target && j > i){
            if(currentAttempt > target){
                j--;
            } else if (currentAttempt < target){
                i++;
            }
            currentAttempt = numbers[i]+numbers[j];
        }

        int[] solutions = new int[2];
        solutions[0] = i+1;
        solutions[1] = j+1;
        return solutions;
    }
}
