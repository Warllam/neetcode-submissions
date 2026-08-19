class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right= heights.length -1;
        int maxArea = 0;

        while(left < right){
            int hauteur = Math.min(heights[left], heights[right]);

            int largeur = right - left;

            int area = hauteur*largeur;

            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right]){
                left ++;
            }else{
                right --;
            }

        }

        return maxArea;
        
    }
}
