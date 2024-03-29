//package editor.cn;//Given an array of integers nums and an integer target, return indices of the t
////wo numbers such that they add up to target.
////
//// You may assume that each input would have exactly one solution, and you may n
////ot use the same element twice.
////
//// You can return the answer in any order.
////
////
//// Example 1:
////
////
////Input: nums = [2,7,11,15], target = 9
////Output: [0,1]
////Output: Because nums[0] + nums[1] == 9, we return [0, 1].
////
////
//// Example 2:
////
////
////Input: nums = [3,2,4], target = 6
////Output: [1,2]
////
////
//// Example 3:
////
////
////Input: nums = [3,3], target = 6
////Output: [0,1]
////
////
////
//// Constraints:
////
////
//// 2 <= nums.length <= 105
//// -109 <= nums[i] <= 109
//// -109 <= target <= 109
//// Only one valid answer exists.
////
//// Related Topics 数组 哈希表
//// 👍 9258 👎 0
//
//
//import java.util.HashMap;
//import java.util.Map;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
///*
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) return new int[]{i, j};
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//*/
///*
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//*/
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
