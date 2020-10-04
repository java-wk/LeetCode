//package editor.cn;
////Given a sorted array and a target value, return the index if the target is fou
////nd. If not, return the index where it would be if it were inserted in order.
////
//// You may assume no duplicates in the array.
////
//// Example 1:
////
////
////Input: [1,3,5,6], 5
////Output: 2
////
////
//// Example 2:
////
////
////Input: [1,3,5,6], 2
////Output: 1
////
////
//// Example 3:
////
////
////Input: [1,3,5,6], 7
////Output: 4
////
////
//// Example 4:
////
////
////Input: [1,3,5,6], 0
////Output: 0
////
//// Related Topics 数组 二分查找
//// 👍 703 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        int n = nums.length;
//        int left = 0, right = n - 1, ans = n;
//        while (left <= right) {
//            int mid = ((right - left) >> 1) + left;
//            if (target <= nums[mid]) {
//                ans = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return ans;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
