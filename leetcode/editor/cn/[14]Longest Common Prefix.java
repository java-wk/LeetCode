//package editor.cn;
////Write a function to find the longest common prefix string amongst an array of
////strings.
////
//// If there is no common prefix, return an empty string "".
////
//// Example 1:
////
////
////Input: ["flower","flow","flight"]
////Output: "fl"
////
////
//// Example 2:
////
////
////Input: ["dog","racecar","car"]
////Output: ""
////Explanation: There is no common prefix among the input strings.
////
////
//// Note:
////
//// All given inputs are in lowercase letters a-z.
//// Related Topics 字符串
//// 👍 1293 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//        String prefix = strs[0];
//        int count = strs.length;
//        for (int i = 1; i < count; i++) {
//            prefix = longestCommonPrefix(prefix, strs[i]);
//            if (prefix.length() == 0) break;
//        }
//        return prefix;
//    }
//
//    public String longestCommonPrefix(String str1, String str2) {
//        int length = Math.min(str1.length(), str2.length());
//        int index = 0;
//        while (index < length && str1.charAt(index) == str2.charAt(index)) index++;
//        return str1.substring(0, index);
//    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
