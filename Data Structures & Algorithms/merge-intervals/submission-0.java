class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        output.add(intervals[0]);



        for (int i = 1 ; i < intervals.length ; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            int[] lastInterval = output.get(output.size() - 1);
            if(left <= lastInterval[1]){
                if(right > lastInterval[1]){
                    lastInterval[1] = right;
                }
            }else{
                        output.add(intervals[i]);
            }
        }


        return output.toArray(new int[output.size()][]);

    }
}
