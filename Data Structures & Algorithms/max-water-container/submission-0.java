class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int volumeMax = 0;
        while(l < r){
            int volume = (r-l) * Math.min(heights[l],heights[r]);
            volumeMax = Math.max(volume, volumeMax);

            if(heights[r] > heights[l]){
                l ++;
            }else{
                r --;
            }
        }

        return volumeMax;
    }
}
