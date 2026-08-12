class Solution {
    private static int[][] directions = {{0,1},{0,-1}, {1,0},{-1,0}};

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        for(int r = 0 ; r < rows ; r++){
            for(int c = 0 ; c < cols ; c++){
                if(grid[r][c] == 1){
                    maxArea = Math.max(maxArea, maxArea(grid, r ,c, 0));
                }
            }
        }

        return maxArea;
    }

    private static int maxArea(int[][] grid, int r, int c, int maxArea){
        if(r < 0 || c < 0 || r>= grid.length || c>= grid[0].length || grid[r][c] == 0 ){
            return maxArea;
        }

        grid[r][c] = 0;
        maxArea ++;
        for(int[] dir : directions){
            maxArea = maxArea(grid, r+dir[0], c+dir[1], maxArea);
        }
        return maxArea;
    }
}
