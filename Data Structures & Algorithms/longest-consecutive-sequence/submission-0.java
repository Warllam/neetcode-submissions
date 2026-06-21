class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> setElements = new HashSet<>();
        int longestConsecutive = 0;
        for(int num : nums){
            setElements.add(num);
        }

        for (int value : setElements) {
            if (!setElements.contains(value - 1)) {
                int current = value;
                int length = 1;

                while (setElements.contains(current + 1)) {
                    current++;
                    length++;
                }

                longestConsecutive = Math.max(longestConsecutive, length);
            }
        }

        return longestConsecutive;
    }
}
