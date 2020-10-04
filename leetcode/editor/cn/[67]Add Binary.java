//package editor.cn;
////Given two binary strings, return their sum (also a binary string).
////
//// The input strings are both non-empty and contains only characters 1 or 0.
////
//// Example 1:
////
////
////Input: a = "11", b = "1"
////Output: "100"
////
//// Example 2:
////
////
////Input: a = "1010", b = "1011"
////Output: "10101"
////
////
//// Constraints:
////
////
//// Each string consists only of '0' or '1' characters.
//// 1 <= a.length, b.length <= 10^4
//// Each string is either "0" or doesn't contain any leading zero.
////
//// Related Topics 数学 字符串
//// 👍 489 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public String addBinary(String a, String b) {
//
///*        如果 aa 的位数是 nn，bb 的位数为 mm，这个算法的渐进时间复杂度为 O(n + m)O(n+m)。但是这里非常简单的实现基于 Python 和 Java 本身的高精度功能，在其他的语言中可能并不适用，并且在 Java 中：
//
//        如果字符串超过 3333 位，不能转化为 Integer
//        如果字符串超过 6565 位，不能转化为 Long
//        如果字符串超过 500000001500000001 位，不能转化为 BigInteger
//        因此，为了适用于长度较大的字符串计算，我们应该使用更加健壮的算法。。
//        */
////        return Integer.toBinaryString(
////                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
////        );
//
//
//
//
//        StringBuffer ans = new StringBuffer();
//
//        int n = Math.max(a.length(), b.length()), carry = 0;
//        for (int i = 0; i < n; ++i) {
//            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
//            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
//            ans.append((char) (carry % 2 + '0'));
//            carry /= 2;
//        }
//
//        if (carry > 0) {
//            ans.append('1');
//        }
//        ans.reverse();
//
//        return ans.toString();
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
