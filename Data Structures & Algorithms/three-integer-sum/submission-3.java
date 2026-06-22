class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(nums);

        Integer previousK = Integer.MAX_VALUE;
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] != previousK) {
                previousK = nums[k];
                int targetK = -nums[k];
                int i = k + 1;
                int j = nums.length - 1;
                while (j > i) {
                    if ((nums[i] + nums[j]) > targetK) {
                        j--;
                    } else if ((nums[i] + nums[j]) < targetK) {
                        i++;
                    } else {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[k]);
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplets.add(triplet);

                        i++;
                        j--;
                        while (i < j && nums[i] == nums[i - 1]) {
                            i++;
                        }
                    }
                }
            }
        }

        return triplets;
    }
}
