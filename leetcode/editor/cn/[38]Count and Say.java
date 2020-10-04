//package editor.cn;
////The count-and-say sequence is the sequence of integers with the first five ter
////ms as following:
////
////
////1.     1
////2.     11
////3.     21
////4.     1211
////5.     111221
////
////
//// 1 is read off as "one 1" or 11.
////11 is read off as "two 1s" or 21.
////21 is read off as "one 2, then one 1" or 1211.
////
//// Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-s
////ay sequence. You can do so recursively, in other words from the previous member
////read off the digits, counting the number of digits in groups of the same digit.
////
////
//// Note: Each term of the sequence of integers will be represented as a string.
////
////
////
////
//// Example 1:
////
////
////Input: 1
////Output: "1"
////Explanation: This is the base case.
////
////
//// Example 2:
////
////
////Input: 4
////Output: "1211"
////Explanation: For n = 3 the term was "21" in which we have two groups "2" and "
////1", "2" can be read as "12" which means frequency = 1 and value = 2, the same wa
////y "1" is read as "11", so the answer is the concatenation of "12" and "11" which
//// is "1211".
////
//// Related Topics 字符串
//// 👍 566 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public String countAndSay(int n) {
//// 递归终止条件
//        if (n == 1) {
//            return "1";
//        }
//        StringBuffer res = new StringBuffer();
//        // 拿到上一层的字符串
//        String str = countAndSay(n - 1);
//        int length = str.length();
//        // 开始指针为0
//        int start = 0;
//        // 注意这从起始条件要和下面长度统一
//        for (int i = 1; i < length + 1; i++) {
//            // 字符串最后一位直接拼接
//            if (i == length) {
//                res.append(i - start).append(str.charAt(start));
//                // 直到start位的字符串和i位的字符串不同，拼接并更新start位
//            } else if (str.charAt(i) != str.charAt(start) ) {
//                res.append(i - start).append(str.charAt(start));
//                start = i;
//            }
////            System.out.println("res=" + res);
//        }
////        System.out.println(res);
//        return res.toString();
//
//    }
//
////    public static void main(String[] args) {
////        System.out.println(new Solution().countAndSay(8));
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
