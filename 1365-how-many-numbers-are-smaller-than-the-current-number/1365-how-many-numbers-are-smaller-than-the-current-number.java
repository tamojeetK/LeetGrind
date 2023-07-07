class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArr = new int[nums.length];
        
        for (int index = 0; index < nums.length; index++) {
            int count = countNum(nums, nums[index]);
            newArr[index] = count;
        }

        return newArr;
    }
    public static int countNum(int[] nums, int target){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == target){
                continue;
            }
            if(nums[i]<target){
                count++;
            }
        }
        return count;
    }
}