//package editor.cn;
////Implement strStr().
////
//// Return the index of the first occurrence of needle in haystack, or -1 if need
////le is not part of haystack.
////
//// Example 1:
////
////
////Input: haystack = "hello", needle = "ll"
////Output: 2
////
////
//// Example 2:
////
////
////Input: haystack = "aaaaa", needle = "bba"
////Output: -1
////
////
//// Clarification:
////
//// What should we return when needle is an empty string? This is a great questio
////n to ask during an interview.
////
//// For the purpose of this problem, we will return 0 when needle is an empty str
////ing. This is consistent to C's strstr() and Java's indexOf().
////
////
//// Constraints:
////
////
//// haystack and needle consist only of lowercase English characters.
////
//// Related Topics 双指针 字符串
//// 👍 587 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int strStr(String haystack, String needle) {
////        int L = needle.length(), n = haystack.length();
////
////        for (int start = 0; start < n - L + 1; ++start) {
////            if (haystack.substring(start, start + L).equals(needle)) {
////                return start;
////            }
////        }
////        return -1;
//
//
////        int L = needle.length(), n = haystack.length();
////        if (L == 0) return 0;
////
////        int pn = 0;
////        while (pn < n - L + 1) {
////            // find the position of the first needle character
////            // in the haystack string
////            while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) ++pn;
////
////            // compute the max match string
////            int currLen = 0, pL = 0;
////            while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
////                ++pn;
////                ++pL;
////                ++currLen;
////            }
////
////            // if the whole needle string is found,
////            // return its start position
////            if (currLen == L) return pn - L;
////
////            // otherwise, backtrack
////            pn = pn - currLen + 1;
////        }
////        return -1;
//
//
//
//
//        int L = needle.length(), n = haystack.length();
//        if (L > n) return -1;
//
//        // base value for the rolling hash function
//        int a = 26;
//        // modulus value for the rolling hash function to avoid overflow
//        long modulus = (long)Math.pow(2, 31);
//
//        // compute the hash of strings haystack[:L], needle[:L]
//        long h = 0, ref_h = 0;
//        for (int i = 0; i < L; ++i) {
//            h = (h * a + charToInt(i, haystack)) % modulus;
//            ref_h = (ref_h * a + charToInt(i, needle)) % modulus;
//        }
//        if (h == ref_h) return 0;
//
//        // const value to be used often : a**L % modulus
//        long aL = 1;
//        for (int i = 1; i <= L; ++i) aL = (aL * a) % modulus;
//
//        for (int start = 1; start < n - L + 1; ++start) {
//            // compute rolling hash in O(1) time
//            h = (h * a - charToInt(start - 1, haystack) * aL
//                    + charToInt(start + L - 1, haystack)) % modulus;
//            if (h == ref_h) return start;
//        }
//        return -1;
//    }
//    // function to convert character to integer
//    public int charToInt(int idx, String s) {
//        return (int)s.charAt(idx) - (int)'a';
//    }
//
//    public static void main(String[] args) {
//        System.out.println((int)'a');
//        System.out.println((int)'b');
//        System.out.println((long)Math.pow(2, 31));
//    }
//
//
//}
////leetcode submit region end(Prohibit modification and deletion)
