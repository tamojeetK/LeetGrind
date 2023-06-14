class Solution {
        public int[] searchRange(int[] nums, int target) {

        int first = search(nums, target, true);
        int end = search(nums, target, false);

        return new int[] {first, end};       

    }

    public int search(int[] nums, int target, boolean firstCheckStart) {

        int ans = -1;

        int startIndx = 0;
        int endIndx = nums.length - 1;

        while (startIndx <= endIndx) {
            int midIndx = startIndx + (endIndx - startIndx) / 2;

            if (target > nums[midIndx]) {
                startIndx = midIndx + 1;
            }
            if (target < nums[midIndx]) {
                endIndx = midIndx - 1;
            }
            if (target == nums[midIndx]) {
                ans = midIndx;
                if(firstCheckStart){
                    endIndx = midIndx-1;
                }
                else {
                    startIndx = midIndx+1;
                }

            }
        }

        return ans;

    }
}