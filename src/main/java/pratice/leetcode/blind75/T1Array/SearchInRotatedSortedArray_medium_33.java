package pratice.leetcode.blind75.T1Array;

import pratice.common.Out;

public class SearchInRotatedSortedArray_medium_33 {
    static class Solution {
        public int search(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int m = (l + r) >> 1;
                if (nums[m] == target) return m;
                if (nums[l] <= nums[m]) {
                    if (nums[l] <= target && target < nums[m])
                        r = m - 1;
                    else l = m + 1;
                } else {
                    if (nums[m] < target && target < nums[r])
                        l = m + 1;
                    else r = m - 1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        Out.print(sol.search(nums, target));
    }
}
