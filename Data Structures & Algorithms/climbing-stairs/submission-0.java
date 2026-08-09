class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;

        int climbpreviousPrevious = 1;
        int climbPrevious = 2;
        
        for(int i = 3; i <= n ; i++){
            int climbI = climbPrevious + climbpreviousPrevious;
            climbpreviousPrevious = climbPrevious;
            climbPrevious = climbI;
        }

        return climbPrevious;
    }
}
