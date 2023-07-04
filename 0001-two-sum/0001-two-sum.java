import java.util.*;
class Solution {
    //Efficient method \U0001f447\U0001f3fb\U0001f447\U0001f3fb\U0001f447\U0001f3fb`
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> newMap = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            
            if(newMap.containsKey(complement)){
                return new int[] {newMap.get(complement), i};
            }
            
            newMap.put(nums[i], i);
        }
        
        return nums;
    }
}
// Brute Force \U0001f447\U0001f3fb\U0001f447\U0001f3fb\U0001f447\U0001f3fb
// class Solution {
//     public static int[] twoSum(int[] nums, int target) {
//         int[] arr = nums.clone();
//         Arrays.sort(arr);

//         int s = 0;
//         int e = arr.length - 1;
//         while (s < e) {
//             int sum = arr[s] + arr[e];
//             if (sum == target) {
//                 int index1 = indexOf(nums, arr[s]);
//                 int index2 = lastIndexOf(nums, arr[e]);
//                 return new int[] { index1, index2 };
//             }
//             if (sum > target) {
//                 e--;
//                 continue;
//             }
//          if (arr[e] < target) {
//                 s++;
//                 e = arr.length - 1;
//             }
//         }
    
//         return new int[] { -1, -1 };
//     }

//     static int indexOf(int[] nums, int value) {
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == value) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     static int lastIndexOf(int[] nums, int value) {
//         for (int i = nums.length - 1; i >= 0; i--) {
//             if (nums[i] == value) {
//                 return i;
//             }
//         }
//         return -1;
//     }

// }