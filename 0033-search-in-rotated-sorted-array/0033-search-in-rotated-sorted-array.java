class Solution {
    public int search(int[] nums, int target) {

        int pivot = findPivot(nums, target, 0, nums.length - 1);

        // if pivot is not found, do normal BS
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found:
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            //
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            // 1,2,3,4,5 , target = 2
            if (nums[mid] < target) {
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums, int target, int start, int end) {
        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            // 6,7,0,4,5
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } // 3,4,6,1,2
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}