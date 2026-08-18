class Solution {

    private Map<Integer, List<Integer>> preMap = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }

        for (int[] preReq : prerequisites) {
            preMap.get(preReq[0]).add(preReq[1]);
        }

        for (int j = 0; j < numCourses; j++) {
            if (!dfs(j)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int j) {

        if (visiting.contains(j)) {
            return false;
        }
        if (preMap.get(j).isEmpty()) {
            return true;
        }

        visiting.add(j);

        for (int pre : preMap.get(j)) {
            if (!dfs(pre)) {
                return false;
            }
        }

        visiting.remove(j);
        preMap.put(j, new ArrayList<>());
        return true;
    }
}