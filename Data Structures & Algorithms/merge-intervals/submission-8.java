class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();

        merged.add(intervals[0]);

        for(int i = 1; i<intervals.length ; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];


            int[] lastMerged = merged.get(merged.size()-1);

            if(start <= lastMerged[1]){
                if(end > lastMerged[1]){
                    lastMerged[1] = end;
                }
            }else{
                merged.add(intervals[i]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
