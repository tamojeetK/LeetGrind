class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        
        while(s<e){

            int indxOfMinNumber = min(nums, s);
            int temp = nums[s];
            nums[s] = nums[indxOfMinNumber];
            nums[indxOfMinNumber] = temp;
            s = s+1;
        }


        System.out.println(Arrays.toString(nums));
    }

    public int min(int[] nums, int s){
        int min = s;
        for (int i = s+1; i < nums.length; i++) {
            if(nums[i]<nums[min]){
                min = i;
            }
        }
        return min;
    }
}