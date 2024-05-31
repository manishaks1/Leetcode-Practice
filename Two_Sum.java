### Brute Force Approach ####

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    found = true;
                    break;
                }
            }
        if(found)
            break;
        }
        return res;

    }
}
