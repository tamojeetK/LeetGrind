import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Efficient method \U0001f447\U0001f3fb\U0001f447\U0001f3fb\U0001f447\U0001f3fb
        Set<Integer> newSet = new HashSet<>();
        
        for(int num : nums){
            if(newSet.contains(num)){
                return true;
            }
            newSet.add(num);
        }
        return false;
        
        //*********************************************************************
        // Brute Force \U0001f447\U0001f3fb\U0001f447\U0001f3fb\U0001f447\U0001f3fb that will not work in case of large array
        
//         int s = 0, e = nums.length-1;

//         while(s<e){
//             while(s<e && e>s){
//                 if(nums[s] == nums[e]){
//                     return true;
//                 }
//                 e--;
//             }
//             s++;
//             e = nums.length-1;
//         }

//         return false;
        
    }
}