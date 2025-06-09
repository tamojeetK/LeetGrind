class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            int current = nums[i];
            int difference = target - current;
            if(map.containsKey(difference)){
                return new int[]{map.get(difference), i};
            }
            map.put(current, i);
        }
        return new int[]{-1, -1};
    }
}