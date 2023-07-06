class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            // check if the num at i is != 0

            if (nums[i] != 0) {

                nums[idx] = nums[i];

                // check if i and idx are same
                if (i==idx) {
                    nums[i] = nums[i];
                }

                // if not then assign 0 to the no. at i index
                else {
                    nums[i] = 0;
                }
                idx++;
            }
        }
    }
}