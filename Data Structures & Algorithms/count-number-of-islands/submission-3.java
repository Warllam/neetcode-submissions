class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int r = 0 ; r < rows ; r++){
            for(int c = 0 ; c < cols ; c++){
                if(grid[r][c] == '1'){
                    dfs(grid,r, c);
                    islands++;
                }
            }   
        }
        return islands;
    }

    private static void dfs(char[][] grid, int r, int c){
         if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0'){
            return;
        }
        
        if(grid[r][c] == '1'){
            grid[r][c] = '0';
            for(int[] dir : directions){
                int row = r + dir[0];
                int col = c + dir[1];

                dfs(grid, row, col);
            }
        }
    }
}
