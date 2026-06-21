class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mostFrequents = new HashMap<>();

        for(int number : nums){
            mostFrequents.merge(number, 1, Integer::sum);
        }

        return mostFrequents.entrySet().stream()
                        .sorted((a,b) -> b.getValue() - a.getValue())
                        .limit(k)
                        .map(Map.Entry::getKey)
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
}
