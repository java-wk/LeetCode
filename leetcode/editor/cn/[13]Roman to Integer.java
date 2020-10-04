//package editor.cn;//Roman numerals are represented by seven different symbols: I, V, X, L, C, D an
////d M.
////
////
////Symbol       Value
////I             1
////V             5
////X             10
////L             50
////C             100
////D             500
////M             1000
////
//// For example, two is written as II in Roman numeral, just two one's added toge
////ther. Twelve is written as, XII, which is simply X + II. The number twenty seven
//// is written as XXVII, which is XX + V + II.
////
//// Roman numerals are usually written largest to smallest from left to right. Ho
////wever, the numeral for four is not IIII. Instead, the number four is written as
////IV. Because the one is before the five we subtract it making four. The same prin
////ciple applies to the number nine, which is written as IX. There are six instance
////s where subtraction is used:
////
////
//// I can be placed before V (5) and X (10) to make 4 and 9.
//// X can be placed before L (50) and C (100) to make 40 and 90.
//// C can be placed before D (500) and M (1000) to make 400 and 900.
////
////
//// Given a roman numeral, convert it to an integer. Input is guaranteed to be wi
////thin the range from 1 to 3999.
////
//// Example 1:
////
////
////Input: "III"
////Output: 3
////
//// Example 2:
////
////
////Input: "IV"
////Output: 4
////
//// Example 3:
////
////
////Input: "IX"
////Output: 9
////
//// Example 4:
////
////
////Input: "LVIII"
////Output: 58
////Explanation: L = 50, V= 5, III = 3.
////
////
//// Example 5:
////
////
////Input: "MCMXCIV"
////Output: 1994
////Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//// Related Topics 数学 字符串
//// 👍 1062 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int romanToInt(String s) {
//        int sum = 0;
//        int preNum = getValue(s.charAt(0));
//        for(int i = 1;i < s.length(); i ++) {
//            int num = getValue(s.charAt(i));
//            if(preNum < num) {
//                sum -= preNum;
//            } else {
//                sum += preNum;
//            }
//            preNum = num;
//        }
//        sum += preNum;
//        return sum;
//    }
//
//    private int getValue(char ch) {
//        switch(ch) {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//            default: return 0;
//        }
//    }
//
////    public static void main(String[] args) {
////        char c = "123qwe".charAt("123qwe".length()-1);
////
////        System.out.println("123qwe".charAt(1));
////        System.out.println("123qwe".charAt(4));
////        System.out.println(c);
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
