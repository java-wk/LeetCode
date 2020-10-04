//package editor.cn;
////Implement int sqrt(int x).
////
//// Compute and return the square root of x, where x is guaranteed to be a non-ne
////gative integer.
////
//// Since the return type is an integer, the decimal digits are truncated and onl
////y the integer part of the result is returned.
////
//// Example 1:
////
////
////Input: 4
////Output: 2
////
////
//// Example 2:
////
////
////Input: 8
////Output: 2
////Explanation: The square root of 8 is 2.82842..., and since
////             the decimal part is truncated, 2 is returned.
////
//// Related Topics 数学 二分查找
//// 👍 518 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int mySqrt(int x) {
//
////        if (x == 0) return 0;
////        int ans = (int) Math.exp(0.5 * Math.log(x));
////        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
//
//
//        int l = 0, r = x, ans = -1;
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            if ((long) mid * mid <= x) {
//                ans = mid;
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//        }
//        return ans;
//
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
