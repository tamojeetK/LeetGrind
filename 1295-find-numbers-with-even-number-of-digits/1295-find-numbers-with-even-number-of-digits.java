class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;

        for(int i=0; i<nums.length; i++){
            // counted = count(nums[i]); 
            /*
            inside loop
            1. extract num
            2. run count()
            3. check isEven()
            -- if Even countNum++
            4. return number of Even counted            
            */           
            int num = nums[i];
            int count = count(num);
            if(isEven(count)){
                counter++;
            }

        }
        return counter;
    }
    //even func
    static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    //counter func
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}